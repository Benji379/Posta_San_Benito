package Vista;

import Controlador.ControladorNewPaciente;

public class MdlNewPaciente extends javax.swing.JPanel {
    
    private final ControladorNewPaciente C;
    
    public MdlNewPaciente() {
        initComponents();
        C = new ControladorNewPaciente(this);
        C.init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser = new com.raven.datechooser.DateChooser();
        jlbTittle = new javax.swing.JLabel();
        panelTabla = new Componentes.PanelCustom();
        scroll = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jlbTittleTabla = new javax.swing.JLabel();
        panelTabla1 = new Componentes.PanelCustom();
        pDni = new javax.swing.JPanel();
        jlbDni = new javax.swing.JLabel();
        txtDni = new Componentes.TextFieldSuggestion();
        pNombres = new javax.swing.JPanel();
        jlbNombres = new javax.swing.JLabel();
        txtNombres = new Componentes.TextFieldSuggestion();
        pApellidoPaterno = new javax.swing.JPanel();
        jlbApellidoPaterno = new javax.swing.JLabel();
        txtApellidoPaterno = new Componentes.TextFieldSuggestion();
        pApellidoMaterno = new javax.swing.JPanel();
        jlbApellidoMaterno = new javax.swing.JLabel();
        txtApellidoMaterno = new Componentes.TextFieldSuggestion();
        pSexo = new javax.swing.JPanel();
        jlbSexo = new javax.swing.JLabel();
        comboSexo = new Componentes.ComboBoxSuggestion();
        pProcedencia = new javax.swing.JPanel();
        jlbProcedencia = new javax.swing.JLabel();
        comboProcedencia = new Componentes.ComboBoxSuggestion();
        pOcupacion = new javax.swing.JPanel();
        jlbOcupacion = new javax.swing.JLabel();
        txtOcupacion = new Componentes.TextFieldSuggestion();
        pEscolaridad = new javax.swing.JPanel();
        jlbEscolaridad = new javax.swing.JLabel();
        comboEscolaridad = new Componentes.ComboBoxSuggestion();
        pEstadoCivil = new javax.swing.JPanel();
        jlbEstadoCivil = new javax.swing.JLabel();
        comboEstadoCivil = new Componentes.ComboBoxSuggestion();
        pNumHijos = new javax.swing.JPanel();
        jlbHijos = new javax.swing.JLabel();
        txtCantHijos = new javax.swing.JSpinner();
        pGrupoSanguineo = new javax.swing.JPanel();
        jlbGrupoSanguineo = new javax.swing.JLabel();
        comboGrupoSanguineo = new Componentes.ComboBoxSuggestion();
        pRh = new javax.swing.JPanel();
        jlbRh = new javax.swing.JLabel();
        comboRh = new Componentes.ComboBoxSuggestion();
        pResidencia = new javax.swing.JPanel();
        jlbResidencia = new javax.swing.JLabel();
        txtResidencia = new Componentes.TextFieldSuggestion();
        pFechaNacimiento = new javax.swing.JPanel();
        jlbOcupacion1 = new javax.swing.JLabel();
        txtFechaNacimiento = new Componentes.TextFieldSuggestion();
        pResidencia1 = new javax.swing.JPanel();
        btnRegistrar3 = new Componentes.Button();

        dateChooser.setDateFormat(new java.text.SimpleDateFormat("dd/MM/yyyy"));
        dateChooser.setTextField(txtFechaNacimiento);

        jlbTittle.setFont(new java.awt.Font("Century Gothic", 0, 45)); // NOI18N
        jlbTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTittle.setText("NUEVO PACIENTE");

        panelTabla.setBackground(new java.awt.Color(255, 255, 255));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N", "DNI", "Nombres", "Apellidos", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setSelectionBackground(new java.awt.Color(173, 221, 219));
        tabla.getTableHeader().setReorderingAllowed(false);
        scroll.setViewportView(tabla);

        jlbTittleTabla.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jlbTittleTabla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTittleTabla.setText("Lista de Paciente");

        javax.swing.GroupLayout panelTablaLayout = new javax.swing.GroupLayout(panelTabla);
        panelTabla.setLayout(panelTablaLayout);
        panelTablaLayout.setHorizontalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlbTittleTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        panelTablaLayout.setVerticalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlbTittleTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        panelTabla1.setBackground(new java.awt.Color(255, 255, 255));
        panelTabla1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 10));

        pDni.setBackground(new java.awt.Color(255, 255, 255));
        pDni.setPreferredSize(new java.awt.Dimension(180, 100));

        jlbDni.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbDni.setText("DNI");

        txtDni.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        javax.swing.GroupLayout pDniLayout = new javax.swing.GroupLayout(pDni);
        pDni.setLayout(pDniLayout);
        pDniLayout.setHorizontalGroup(
            pDniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDniLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pDniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        pDniLayout.setVerticalGroup(
            pDniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDniLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbDni, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        panelTabla1.add(pDni);

        pNombres.setBackground(new java.awt.Color(255, 255, 255));
        pNombres.setPreferredSize(new java.awt.Dimension(180, 100));

        jlbNombres.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbNombres.setText("Nombres");

        txtNombres.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        javax.swing.GroupLayout pNombresLayout = new javax.swing.GroupLayout(pNombres);
        pNombres.setLayout(pNombresLayout);
        pNombresLayout.setHorizontalGroup(
            pNombresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNombresLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pNombresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        pNombresLayout.setVerticalGroup(
            pNombresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNombresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        panelTabla1.add(pNombres);

        pApellidoPaterno.setBackground(new java.awt.Color(255, 255, 255));
        pApellidoPaterno.setPreferredSize(new java.awt.Dimension(180, 100));

        jlbApellidoPaterno.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbApellidoPaterno.setText("Apellido Paterno");

        txtApellidoPaterno.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        javax.swing.GroupLayout pApellidoPaternoLayout = new javax.swing.GroupLayout(pApellidoPaterno);
        pApellidoPaterno.setLayout(pApellidoPaternoLayout);
        pApellidoPaternoLayout.setHorizontalGroup(
            pApellidoPaternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pApellidoPaternoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pApellidoPaternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbApellidoPaterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        pApellidoPaternoLayout.setVerticalGroup(
            pApellidoPaternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pApellidoPaternoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbApellidoPaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        panelTabla1.add(pApellidoPaterno);

        pApellidoMaterno.setBackground(new java.awt.Color(255, 255, 255));
        pApellidoMaterno.setPreferredSize(new java.awt.Dimension(180, 100));

        jlbApellidoMaterno.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbApellidoMaterno.setText("Apelido Materno");

        txtApellidoMaterno.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        javax.swing.GroupLayout pApellidoMaternoLayout = new javax.swing.GroupLayout(pApellidoMaterno);
        pApellidoMaterno.setLayout(pApellidoMaternoLayout);
        pApellidoMaternoLayout.setHorizontalGroup(
            pApellidoMaternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pApellidoMaternoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pApellidoMaternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbApellidoMaterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        pApellidoMaternoLayout.setVerticalGroup(
            pApellidoMaternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pApellidoMaternoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbApellidoMaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        panelTabla1.add(pApellidoMaterno);

        pSexo.setBackground(new java.awt.Color(255, 255, 255));
        pSexo.setPreferredSize(new java.awt.Dimension(180, 100));

        jlbSexo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbSexo.setText("Sexo");

        comboSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F" }));

        javax.swing.GroupLayout pSexoLayout = new javax.swing.GroupLayout(pSexo);
        pSexo.setLayout(pSexoLayout);
        pSexoLayout.setHorizontalGroup(
            pSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSexoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlbSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        pSexoLayout.setVerticalGroup(
            pSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSexoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbSexo, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        panelTabla1.add(pSexo);

        pProcedencia.setBackground(new java.awt.Color(255, 255, 255));
        pProcedencia.setPreferredSize(new java.awt.Dimension(180, 100));

        jlbProcedencia.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbProcedencia.setText("Procedencia");

        comboProcedencia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Afganistán", "Albania", "Alemania", "Andorra", "Angola", "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiyán", "Bahamas", "Bangladés", "Barbados", "Baréin", "Bélgica", "Belice", "Benín", "Bielorrusia", "Birmania", "Bolivia", "Bosnia y Herzegovina", "Botsuana", "Brasil", "Brunéi", "Bulgaria", "Burkina Faso", "Burundi", "Bután", "Cabo Verde", "Camboya", "Camerún", "Canadá", "Catar", "Chad", "Chile", "China", "Chipre", "Ciudad del Vaticano", "Colombia", "Comoras", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Dominica", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia", "Esuatini", "Etiopía", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gabón", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", "Guinea", "Guinea-Bisáu", "Guinea Ecuatorial", "Guyana", "Haití", "Honduras", "Hungría", "India", "Indonesia", "Irak", "Irán", "Irlanda", "Islandia", "Islas Marshall", "Islas Salomón", "Israel", "Italia", "Jamaica", "Japón", "Jordania", "Kazajistán", "Kenia", "Kirguistán", "Kiribati", "Kosovo", "Kuwait", "Laos", "Lesoto", "Letonia", "Líbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Macedonia del Norte", "Madagascar", "Malasia", "Malaui", "Maldivas", "Malí", "Malta", "Marruecos", "Mauricio", "Mauritania", "México", "Micronesia", "Moldavia", "Mónaco", "Mongolia", "Montenegro", "Mozambique", "Namibia", "Nauru", "Nepal", "Nicaragua", "Níger", "Nigeria", "Noruega", "Nueva Zelanda", "Omán", "Países Bajos", "Pakistán", "Palaos", "Palestina", "Panamá", "Papúa Nueva Guinea", "Paraguay", "Perú", "Polonia", "Portugal", "Reino Unido", "República Centroafricana", "República Checa", "República Democrática del Congo", "República Dominicana", "República del Congo", "República de Corea", "República de Moldova", "República de Sudán del Sur", "República Kirguisa", "República Unida de Tanzania", "Ruanda", "Rumanía", "Rusia", "Samoa", "San Cristóbal y Nieves", "San Marino", "San Vicente y las Granadinas", "Santa Lucía", "Santo Tomé y Príncipe", "Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Sri Lanka", "Sudáfrica", "Sudán", "Suecia", "Suiza", "Surinam", "Tailandia", "Taiwán", "Tayikistán", "Timor Oriental", "Togo", "Tonga", "Trinidad y Tobago", "Túnez", "Turkmenistán", "Turquía", "Tuvalu", "Ucrania", "Uganda", "Uruguay", "Uzbekistán", "Vanuatu", "Venezuela", "Vietnam", "Yemen", "Yibuti", "Zambia", "Zimbabue" }));
        comboProcedencia.setSelectedItem("Perú");

        javax.swing.GroupLayout pProcedenciaLayout = new javax.swing.GroupLayout(pProcedencia);
        pProcedencia.setLayout(pProcedenciaLayout);
        pProcedenciaLayout.setHorizontalGroup(
            pProcedenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pProcedenciaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pProcedenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboProcedencia, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbProcedencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pProcedenciaLayout.setVerticalGroup(
            pProcedenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pProcedenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbProcedencia, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboProcedencia, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        panelTabla1.add(pProcedencia);

        pOcupacion.setBackground(new java.awt.Color(255, 255, 255));
        pOcupacion.setPreferredSize(new java.awt.Dimension(180, 100));

        jlbOcupacion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbOcupacion.setText("Ocupacion");

        txtOcupacion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        javax.swing.GroupLayout pOcupacionLayout = new javax.swing.GroupLayout(pOcupacion);
        pOcupacion.setLayout(pOcupacionLayout);
        pOcupacionLayout.setHorizontalGroup(
            pOcupacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOcupacionLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pOcupacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOcupacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbOcupacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        pOcupacionLayout.setVerticalGroup(
            pOcupacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOcupacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbOcupacion, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        panelTabla1.add(pOcupacion);

        pEscolaridad.setBackground(new java.awt.Color(255, 255, 255));
        pEscolaridad.setPreferredSize(new java.awt.Dimension(180, 100));

        jlbEscolaridad.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbEscolaridad.setText("Escolaridad");

        comboEscolaridad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "INICIAL", "PRIMARIA", "SECUNDARIA", "TECNICO", "SUPERIOR" }));
        comboProcedencia.setSelectedItem("Perú");

        javax.swing.GroupLayout pEscolaridadLayout = new javax.swing.GroupLayout(pEscolaridad);
        pEscolaridad.setLayout(pEscolaridadLayout);
        pEscolaridadLayout.setHorizontalGroup(
            pEscolaridadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEscolaridadLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pEscolaridadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboEscolaridad, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbEscolaridad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pEscolaridadLayout.setVerticalGroup(
            pEscolaridadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEscolaridadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbEscolaridad, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboEscolaridad, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        panelTabla1.add(pEscolaridad);

        pEstadoCivil.setBackground(new java.awt.Color(255, 255, 255));
        pEstadoCivil.setPreferredSize(new java.awt.Dimension(180, 100));

        jlbEstadoCivil.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbEstadoCivil.setText("Estado Civil");

        comboEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SOLTERO", "CASADO", "VIUDO", "DIVORCIADO" }));
        comboProcedencia.setSelectedItem("Perú");

        javax.swing.GroupLayout pEstadoCivilLayout = new javax.swing.GroupLayout(pEstadoCivil);
        pEstadoCivil.setLayout(pEstadoCivilLayout);
        pEstadoCivilLayout.setHorizontalGroup(
            pEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEstadoCivilLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbEstadoCivil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pEstadoCivilLayout.setVerticalGroup(
            pEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEstadoCivilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbEstadoCivil, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        panelTabla1.add(pEstadoCivil);

        pNumHijos.setBackground(new java.awt.Color(255, 255, 255));
        pNumHijos.setPreferredSize(new java.awt.Dimension(180, 100));

        jlbHijos.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbHijos.setText("# Hijos");

        txtCantHijos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCantHijos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));

        javax.swing.GroupLayout pNumHijosLayout = new javax.swing.GroupLayout(pNumHijos);
        pNumHijos.setLayout(pNumHijosLayout);
        pNumHijosLayout.setHorizontalGroup(
            pNumHijosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNumHijosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pNumHijosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlbHijos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCantHijos, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pNumHijosLayout.setVerticalGroup(
            pNumHijosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNumHijosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbHijos, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCantHijos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        panelTabla1.add(pNumHijos);

        pGrupoSanguineo.setBackground(new java.awt.Color(255, 255, 255));
        pGrupoSanguineo.setPreferredSize(new java.awt.Dimension(180, 100));

        jlbGrupoSanguineo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbGrupoSanguineo.setText("Grupo Sanguíneo");

        comboGrupoSanguineo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "O", "A", "B", "AB" }));
        comboProcedencia.setSelectedItem("Perú");

        javax.swing.GroupLayout pGrupoSanguineoLayout = new javax.swing.GroupLayout(pGrupoSanguineo);
        pGrupoSanguineo.setLayout(pGrupoSanguineoLayout);
        pGrupoSanguineoLayout.setHorizontalGroup(
            pGrupoSanguineoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pGrupoSanguineoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pGrupoSanguineoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboGrupoSanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbGrupoSanguineo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pGrupoSanguineoLayout.setVerticalGroup(
            pGrupoSanguineoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pGrupoSanguineoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbGrupoSanguineo, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboGrupoSanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        panelTabla1.add(pGrupoSanguineo);

        pRh.setBackground(new java.awt.Color(255, 255, 255));
        pRh.setPreferredSize(new java.awt.Dimension(180, 100));

        jlbRh.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbRh.setText("Rh");

        comboRh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "+", "-" }));
        comboProcedencia.setSelectedItem("Perú");

        javax.swing.GroupLayout pRhLayout = new javax.swing.GroupLayout(pRh);
        pRh.setLayout(pRhLayout);
        pRhLayout.setHorizontalGroup(
            pRhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRhLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pRhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboRh, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbRh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pRhLayout.setVerticalGroup(
            pRhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRhLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbRh, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboRh, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        panelTabla1.add(pRh);

        pResidencia.setBackground(new java.awt.Color(255, 255, 255));
        pResidencia.setPreferredSize(new java.awt.Dimension(180, 100));

        jlbResidencia.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbResidencia.setText("Residencia");

        txtResidencia.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        javax.swing.GroupLayout pResidenciaLayout = new javax.swing.GroupLayout(pResidencia);
        pResidencia.setLayout(pResidenciaLayout);
        pResidenciaLayout.setHorizontalGroup(
            pResidenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pResidenciaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pResidenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtResidencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbResidencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        pResidenciaLayout.setVerticalGroup(
            pResidenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pResidenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbResidencia, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        panelTabla1.add(pResidencia);

        pFechaNacimiento.setBackground(new java.awt.Color(255, 255, 255));
        pFechaNacimiento.setPreferredSize(new java.awt.Dimension(180, 100));

        jlbOcupacion1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbOcupacion1.setText("Fecha Nacimiento");

        txtFechaNacimiento.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        javax.swing.GroupLayout pFechaNacimientoLayout = new javax.swing.GroupLayout(pFechaNacimiento);
        pFechaNacimiento.setLayout(pFechaNacimientoLayout);
        pFechaNacimientoLayout.setHorizontalGroup(
            pFechaNacimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFechaNacimientoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pFechaNacimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbOcupacion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        pFechaNacimientoLayout.setVerticalGroup(
            pFechaNacimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFechaNacimientoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbOcupacion1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        panelTabla1.add(pFechaNacimiento);

        pResidencia1.setBackground(new java.awt.Color(255, 255, 255));
        pResidencia1.setPreferredSize(new java.awt.Dimension(180, 100));

        btnRegistrar3.setText("Registrar");
        btnRegistrar3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnRegistrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pResidencia1Layout = new javax.swing.GroupLayout(pResidencia1);
        pResidencia1.setLayout(pResidencia1Layout);
        pResidencia1Layout.setHorizontalGroup(
            pResidencia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pResidencia1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(btnRegistrar3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pResidencia1Layout.setVerticalGroup(
            pResidencia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pResidencia1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnRegistrar3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelTabla1.add(pResidencia1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panelTabla1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jlbTittle, javax.swing.GroupLayout.DEFAULT_SIZE, 1191, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTabla1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(jlbTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(601, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar3ActionPerformed
        C.registrar();
    }//GEN-LAST:event_btnRegistrar3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public Componentes.Button btnRegistrar3;
    public Componentes.ComboBoxSuggestion comboEscolaridad;
    public Componentes.ComboBoxSuggestion comboEstadoCivil;
    public Componentes.ComboBoxSuggestion comboGrupoSanguineo;
    public Componentes.ComboBoxSuggestion comboProcedencia;
    public Componentes.ComboBoxSuggestion comboRh;
    public Componentes.ComboBoxSuggestion comboSexo;
    public com.raven.datechooser.DateChooser dateChooser;
    public javax.swing.JLabel jlbApellidoMaterno;
    public javax.swing.JLabel jlbApellidoPaterno;
    public javax.swing.JLabel jlbDni;
    public javax.swing.JLabel jlbEscolaridad;
    public javax.swing.JLabel jlbEstadoCivil;
    public javax.swing.JLabel jlbGrupoSanguineo;
    public javax.swing.JLabel jlbHijos;
    public javax.swing.JLabel jlbNombres;
    public javax.swing.JLabel jlbOcupacion;
    public javax.swing.JLabel jlbOcupacion1;
    public javax.swing.JLabel jlbProcedencia;
    public javax.swing.JLabel jlbResidencia;
    public javax.swing.JLabel jlbRh;
    public javax.swing.JLabel jlbSexo;
    public javax.swing.JLabel jlbTittle;
    public javax.swing.JLabel jlbTittleTabla;
    public javax.swing.JPanel pApellidoMaterno;
    public javax.swing.JPanel pApellidoPaterno;
    public javax.swing.JPanel pDni;
    public javax.swing.JPanel pEscolaridad;
    public javax.swing.JPanel pEstadoCivil;
    public javax.swing.JPanel pFechaNacimiento;
    public javax.swing.JPanel pGrupoSanguineo;
    public javax.swing.JPanel pNombres;
    public javax.swing.JPanel pNumHijos;
    public javax.swing.JPanel pOcupacion;
    public javax.swing.JPanel pProcedencia;
    public javax.swing.JPanel pResidencia;
    public javax.swing.JPanel pResidencia1;
    public javax.swing.JPanel pRh;
    public javax.swing.JPanel pSexo;
    public Componentes.PanelCustom panelTabla;
    public Componentes.PanelCustom panelTabla1;
    public javax.swing.JScrollPane scroll;
    public javax.swing.JTable tabla;
    public Componentes.TextFieldSuggestion txtApellidoMaterno;
    public Componentes.TextFieldSuggestion txtApellidoPaterno;
    public javax.swing.JSpinner txtCantHijos;
    public Componentes.TextFieldSuggestion txtDni;
    public Componentes.TextFieldSuggestion txtFechaNacimiento;
    public Componentes.TextFieldSuggestion txtNombres;
    public Componentes.TextFieldSuggestion txtOcupacion;
    public Componentes.TextFieldSuggestion txtResidencia;
    // End of variables declaration//GEN-END:variables
}
