package Views;

import Views.Transportation.addDriver;
import Views.Transportation.addTruck;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class MainMenu extends javax.swing.JFrame {
    
    public MainMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbdPanelMenu = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_Trucks = new javax.swing.JTable();
        btn_addTruck = new javax.swing.JButton();
        btn_deleteTruck = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        table_Drivers = new javax.swing.JTable();
        btn_addDriver = new javax.swing.JButton();
        btn_DeleteDriver = new javax.swing.JButton();
        btn_SaveDriver = new javax.swing.JButton();
        btn_saveTruck = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_AddItem = new javax.swing.JButton();
        btn_deleteItem = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Items = new javax.swing.JTable();
        btn_saveItem = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btn_AddOrder = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_DeleteOrder = new javax.swing.JButton();
        btn_SaveOrder = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_Orders = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane6 = new javax.swing.JScrollPane();
        table_Clients = new javax.swing.JTable();
        btn_AddClient = new javax.swing.JButton();
        btn_SaveClient = new javax.swing.JButton();
        btn_DeleteClient = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btn_AddProviders = new javax.swing.JButton();
        btn_DeleteProvider = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        table_Providers = new javax.swing.JTable();
        btn_SaveProvider = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbdPanelMenu.setPreferredSize(new java.awt.Dimension(1100, 700));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Correo:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Telefono:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Dirección:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Yorley de María Aguilar Mendoza");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("yorleymaria96@gmail.com");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("83235610");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Heredia");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario-masculino-de-cerca-la-forma-de-facebook_318-37635_1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(30, 30, 30)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10)
                                .addComponent(jLabel8)
                                .addComponent(jLabel11))))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 416, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11))))
                .addContainerGap(387, Short.MAX_VALUE))
        );

        tbdPanelMenu.addTab("Información Personal", jPanel1);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Camiones");

        table_Trucks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Placa", "Año", "Modelo", "Marca", "RTV", "Gasolina"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_Trucks.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(table_Trucks);

        btn_addTruck.setText("Agregar");
        btn_addTruck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addTruckActionPerformed(evt);
            }
        });

        btn_deleteTruck.setText("Eliminar");
        btn_deleteTruck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteTruckActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Conductores");

        table_Drivers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Correo", "Telefono", "Dirreccion", "Fecha de Nacimiento", "Camion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_Drivers.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(table_Drivers);

        btn_addDriver.setText("Agregar");
        btn_addDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addDriverActionPerformed(evt);
            }
        });

        btn_DeleteDriver.setText("Eliminar");
        btn_DeleteDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteDriverActionPerformed(evt);
            }
        });

        btn_SaveDriver.setText("Guardar");
        btn_SaveDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveDriverActionPerformed(evt);
            }
        });

        btn_saveTruck.setText("Guardar");
        btn_saveTruck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveTruckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1075, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_addTruck)
                        .addGap(18, 18, 18)
                        .addComponent(btn_saveTruck)
                        .addGap(18, 18, 18)
                        .addComponent(btn_deleteTruck))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_addDriver)
                        .addGap(18, 18, 18)
                        .addComponent(btn_SaveDriver)
                        .addGap(18, 18, 18)
                        .addComponent(btn_DeleteDriver))
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(btn_addTruck)
                    .addComponent(btn_deleteTruck)
                    .addComponent(btn_saveTruck))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_addDriver)
                            .addComponent(btn_DeleteDriver)
                            .addComponent(btn_SaveDriver))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(273, Short.MAX_VALUE))
        );

        tbdPanelMenu.addTab("Departamento de Transporte", jPanel2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Articulos");

        btn_AddItem.setText("Agregar ");
        btn_AddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddItemActionPerformed(evt);
            }
        });

        btn_deleteItem.setText("Eliminar");
        btn_deleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteItemActionPerformed(evt);
            }
        });

        table_Items.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Categoria", "Tipo", "Nombre", "Marca", "Paquete", "Peso", "Volumen", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_Items.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table_Items);

        jScrollPane3.setViewportView(jScrollPane1);

        btn_saveItem.setText("Guardar");
        btn_saveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_AddItem)
                        .addGap(18, 18, 18)
                        .addComponent(btn_saveItem)
                        .addGap(18, 18, 18)
                        .addComponent(btn_deleteItem)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1075, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_AddItem)
                    .addComponent(btn_deleteItem)
                    .addComponent(jLabel1)
                    .addComponent(btn_saveItem))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(347, Short.MAX_VALUE))
        );

        tbdPanelMenu.addTab("Departamento de Almacenamiento", jPanel3);

        btn_AddOrder.setText("Crear ");
        btn_AddOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddOrderActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Ordenes");

        btn_DeleteOrder.setText("Eliminar");
        btn_DeleteOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteOrderActionPerformed(evt);
            }
        });

        btn_SaveOrder.setText("Guardar");
        btn_SaveOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveOrderActionPerformed(evt);
            }
        });

        table_Orders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(table_Orders);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Clientes");

        table_Clients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Direccion", "Latitud", "Longitud", "Telefono", "Correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_Clients.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(table_Clients);

        btn_AddClient.setText("Agregar");
        btn_AddClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddClientActionPerformed(evt);
            }
        });

        btn_SaveClient.setText("Guardar");
        btn_SaveClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveClientActionPerformed(evt);
            }
        });

        btn_DeleteClient.setText("Eliminar");
        btn_DeleteClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteClientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_AddOrder)
                        .addGap(18, 18, 18)
                        .addComponent(btn_SaveOrder)
                        .addGap(18, 18, 18)
                        .addComponent(btn_DeleteOrder))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1075, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_AddClient)
                        .addGap(18, 18, 18)
                        .addComponent(btn_SaveClient)
                        .addGap(18, 18, 18)
                        .addComponent(btn_DeleteClient))
                    .addComponent(jScrollPane6))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_AddOrder)
                            .addComponent(btn_DeleteOrder)
                            .addComponent(btn_SaveOrder)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_AddClient)
                        .addComponent(btn_SaveClient)
                        .addComponent(btn_DeleteClient)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        tbdPanelMenu.addTab("Departamento de Ventas", jPanel4);

        jLabel7.setText("Lista de Proveedores");

        btn_AddProviders.setText("Agregar");

        btn_DeleteProvider.setText("Eliminar");

        table_Providers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "ID", "Pais"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_Providers.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(table_Providers);

        btn_SaveProvider.setText("Guardar");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_AddProviders)
                .addGap(18, 18, 18)
                .addComponent(btn_SaveProvider)
                .addGap(18, 18, 18)
                .addComponent(btn_DeleteProvider)
                .addGap(19, 19, 19))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 1075, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(btn_DeleteProvider)
                    .addComponent(btn_SaveProvider)
                    .addComponent(btn_AddProviders))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(501, Short.MAX_VALUE))
        );

        tbdPanelMenu.addTab("Proveedores", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbdPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbdPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddItemActionPerformed
        // TODO add your handling code here:
        ((DefaultTableModel)table_Items.getModel()).addRow(new Object[]{"","","","",""});
    }//GEN-LAST:event_btn_AddItemActionPerformed

    private void btn_deleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteItemActionPerformed
        // TODO add your handling code here:
        int selectedRow = table_Items.getSelectedRow();
        ((DefaultTableModel)table_Items.getModel()).removeRow(selectedRow);
    }//GEN-LAST:event_btn_deleteItemActionPerformed

    private void btn_saveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveItemActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Los datos del articulo "+ "" +" han sido guardados con éxito");
    }//GEN-LAST:event_btn_saveItemActionPerformed

    private void btn_addTruckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addTruckActionPerformed
        // TODO add your handling code here:
        new addTruck().setVisible(true);
    }//GEN-LAST:event_btn_addTruckActionPerformed

    private void btn_saveTruckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveTruckActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Los datos del camion "+ "" +" han sido guardados con éxito");        
    }//GEN-LAST:event_btn_saveTruckActionPerformed

    private void btn_deleteTruckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteTruckActionPerformed
        // TODO add your handling code here:
        int selectedRow = table_Trucks.getSelectedRow();
        ((DefaultTableModel)table_Trucks.getModel()).removeRow(selectedRow);
    }//GEN-LAST:event_btn_deleteTruckActionPerformed

    private void btn_addDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addDriverActionPerformed
        // TODO add your handling code here:
        new addDriver().setVisible(true);
    }//GEN-LAST:event_btn_addDriverActionPerformed

    private void btn_SaveDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveDriverActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Los datos del conductor "+ "" +" han sido guardados con éxito");        
    }//GEN-LAST:event_btn_SaveDriverActionPerformed

    private void btn_DeleteDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteDriverActionPerformed
        // TODO add your handling code here:
        int selectedRow = table_Drivers.getSelectedRow();
        ((DefaultTableModel)table_Drivers.getModel()).removeRow(selectedRow);
    }//GEN-LAST:event_btn_DeleteDriverActionPerformed

    private void btn_AddOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddOrderActionPerformed
        // TODO add your handling code here:
        ((DefaultTableModel)table_Orders.getModel()).addRow(new Object[]{"","","","",""});                
    }//GEN-LAST:event_btn_AddOrderActionPerformed

    private void btn_SaveOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveOrderActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Los datos de la orden "+ "" +" han sido guardados con éxito");        
    }//GEN-LAST:event_btn_SaveOrderActionPerformed

    private void btn_DeleteOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteOrderActionPerformed
        // TODO add your handling code here:
        int selectedRow = table_Orders.getSelectedRow();
        ((DefaultTableModel)table_Orders.getModel()).removeRow(selectedRow);
    }//GEN-LAST:event_btn_DeleteOrderActionPerformed

    private void btn_AddClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddClientActionPerformed
        // TODO add your handling code here:
        ((DefaultTableModel)table_Clients.getModel()).addRow(new Object[]{"","","","",""});                
    }//GEN-LAST:event_btn_AddClientActionPerformed

    private void btn_SaveClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveClientActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Los datos del cliente "+ "" +" han sido guardados con éxito");        
    }//GEN-LAST:event_btn_SaveClientActionPerformed

    private void btn_DeleteClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteClientActionPerformed
        // TODO add your handling code here:
        int selectedRow = table_Clients.getSelectedRow();
        ((DefaultTableModel)table_Clients.getModel()).removeRow(selectedRow);            
    }//GEN-LAST:event_btn_DeleteClientActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AddClient;
    private javax.swing.JButton btn_AddItem;
    private javax.swing.JButton btn_AddOrder;
    private javax.swing.JButton btn_AddProviders;
    private javax.swing.JButton btn_DeleteClient;
    private javax.swing.JButton btn_DeleteDriver;
    private javax.swing.JButton btn_DeleteOrder;
    private javax.swing.JButton btn_DeleteProvider;
    private javax.swing.JButton btn_SaveClient;
    private javax.swing.JButton btn_SaveDriver;
    private javax.swing.JButton btn_SaveOrder;
    private javax.swing.JButton btn_SaveProvider;
    private javax.swing.JButton btn_addDriver;
    private javax.swing.JButton btn_addTruck;
    private javax.swing.JButton btn_deleteItem;
    private javax.swing.JButton btn_deleteTruck;
    private javax.swing.JButton btn_saveItem;
    private javax.swing.JButton btn_saveTruck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable table_Clients;
    private javax.swing.JTable table_Drivers;
    private javax.swing.JTable table_Items;
    private javax.swing.JTable table_Orders;
    private javax.swing.JTable table_Providers;
    private javax.swing.JTable table_Trucks;
    private javax.swing.JTabbedPane tbdPanelMenu;
    // End of variables declaration//GEN-END:variables
}
