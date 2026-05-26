package reglatrapezoidal;

import java.awt.Color;
import java.awt.Font;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmTrapezoidal extends javax.swing.JFrame {

    private static final int MAX_SEGMENTOS = 6;
    private final DecimalFormat fmt = new DecimalFormat("0.######");

    public FrmTrapezoidal() {
        initComponents();
        getContentPane().setBackground(new Color(235, 240, 246));
        tblDatos.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
        txtProcedimiento.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        txtProcedimiento.setText("Ingrese límites, segmentos y presione Generar Tabla.");
        centrarColumnas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRoot = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblInferior = new javax.swing.JLabel();
        txtInferior = new javax.swing.JTextField();
        lblSuperior = new javax.swing.JLabel();
        txtSuperior = new javax.swing.JTextField();
        lblSegmentos = new javax.swing.JLabel();
        txtSegmentos = new javax.swing.JTextField();
        btnGenerar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        scrollTabla = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        scrollProcedimiento = new javax.swing.JScrollPane();
        txtProcedimiento = new javax.swing.JTextArea();
        lblProcedimiento = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        panelGrafica = new reglatrapezoidal.PanelGrafica();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Método Trapezoidal Compuesto");
        setResizable(false);

        pnlRoot.setBackground(new java.awt.Color(245, 248, 252));
        pnlRoot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 198, 214)));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(22, 74, 146));
        lblTitulo.setText("Regla Trapezoidal Compuesta");

        lblInferior.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblInferior.setForeground(new java.awt.Color(70, 83, 105));
        lblInferior.setText("Límite inferior (a)");

        txtInferior.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblSuperior.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSuperior.setForeground(new java.awt.Color(70, 83, 105));
        lblSuperior.setText("Límite superior (b)");

        txtSuperior.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblSegmentos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSegmentos.setForeground(new java.awt.Color(70, 83, 105));
        lblSegmentos.setText("Segmentos (n <= 6)");

        txtSegmentos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnGenerar.setBackground(new java.awt.Color(45, 110, 198));
        btnGenerar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnGenerar.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerar.setText("Generar Tabla");
        btnGenerar.setBorderPainted(false);
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        btnCalcular.setBackground(new java.awt.Color(36, 92, 171));
        btnCalcular.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("Calcular");
        btnCalcular.setBorderPainted(false);
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(107, 118, 136));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        tblDatos.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "i", "Xi", "f(Xi)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDatos.setGridColor(new java.awt.Color(214, 222, 232));
        tblDatos.setRowHeight(23);
        scrollTabla.setViewportView(tblDatos);

        txtProcedimiento.setColumns(20);
        txtProcedimiento.setLineWrap(true);
        txtProcedimiento.setRows(5);
        txtProcedimiento.setWrapStyleWord(true);
        scrollProcedimiento.setViewportView(txtProcedimiento);

        lblProcedimiento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblProcedimiento.setForeground(new java.awt.Color(70, 83, 105));
        lblProcedimiento.setText("Procedimiento");

        lblResultado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(70, 83, 105));
        lblResultado.setText("Resultado");

        txtResultado.setEditable(false);
        txtResultado.setBackground(new java.awt.Color(235, 240, 247));
        txtResultado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(22, 74, 146));

        panelGrafica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(179, 191, 208)));

        javax.swing.GroupLayout pnlRootLayout = new javax.swing.GroupLayout(pnlRoot);
        pnlRoot.setLayout(pnlRootLayout);
        pnlRootLayout.setHorizontalGroup(
            pnlRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRootLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo)
                    .addGroup(pnlRootLayout.createSequentialGroup()
                        .addGroup(pnlRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblInferior)
                            .addComponent(txtInferior, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSuperior)
                            .addComponent(txtSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSegmentos)
                            .addComponent(txtSegmentos, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlRootLayout.createSequentialGroup()
                        .addGroup(pnlRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(scrollTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProcedimiento)
                            .addComponent(scrollProcedimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlRootLayout.createSequentialGroup()
                                .addComponent(lblResultado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtResultado)))
                        .addGap(18, 18, 18)
                        .addComponent(panelGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        pnlRootLayout.setVerticalGroup(
            pnlRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRootLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(pnlRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlRootLayout.createSequentialGroup()
                        .addGroup(pnlRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblInferior)
                            .addComponent(lblSuperior)
                            .addComponent(lblSegmentos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtInferior, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSegmentos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panelGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRootLayout.createSequentialGroup()
                        .addComponent(scrollTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblResultado)
                            .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlRootLayout.createSequentialGroup()
                        .addComponent(lblProcedimiento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollProcedimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        try {
            double a = leerNumero(txtInferior.getText(), "límite inferior");
            double b = leerNumero(txtSuperior.getText(), "límite superior");
            int n = leerSegmentos(txtSegmentos.getText());

            if (b <= a) {
                throw new IllegalArgumentException("El límite superior debe ser mayor que el inferior.");
            }

            DefaultTableModel model = new DefaultTableModel(new Object[]{"i", "Xi", "f(Xi)"}, 0) {
                @Override
                public boolean isCellEditable(int row, int col) {
                    return col != 0;
                }
            };

            double h = (b - a) / n;
            for (int i = 0; i <= n; i++) {
                double xi = a + (i * h);
                model.addRow(new Object[]{i, fmt.format(xi), ""});
            }

            tblDatos.setModel(model);
            centrarColumnas();
            txtResultado.setText("");
            txtProcedimiento.setText("Tabla generada con n = " + n + " segmentos.\n"
                    + "Complete o corrija valores de Xi y f(Xi), luego presione Calcular.");
            panelGrafica.setDatos(new double[0], new double[0]);
        } catch (IllegalArgumentException ex) {
            mostrarError(ex.getMessage());
        }
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        try {
            finalizarEdicionTabla();
            int n = leerSegmentos(txtSegmentos.getText());
            if (tblDatos.getRowCount() != n + 1) {
                throw new IllegalArgumentException("Genere la tabla para el número de segmentos ingresado.");
            }

            double[] x = new double[n + 1];
            double[] fx = new double[n + 1];
            for (int i = 0; i <= n; i++) {
                Object xObj = tblDatos.getValueAt(i, 1);
                Object fObj = tblDatos.getValueAt(i, 2);
                if (xObj == null || fObj == null || xObj.toString().trim().isEmpty() || fObj.toString().trim().isEmpty()) {
                    throw new IllegalArgumentException("La tabla está incompleta. Verifique Xi y f(Xi). (fila " + i + ")");
                }
                x[i] = leerNumero(xObj.toString(), "Xi en fila " + i);
                fx[i] = leerNumero(fObj.toString(), "f(Xi) en fila " + i);
            }

            double a = leerNumero(txtInferior.getText(), "límite inferior");
            double b = leerNumero(txtSuperior.getText(), "límite superior");
            double h = (b - a) / n;

            double sumaInterna = 0;
            StringBuilder internasTexto = new StringBuilder();
            for (int i = 1; i < n; i++) {
                sumaInterna += fx[i];
                internasTexto.append("f(x").append(i).append(")");
                if (i < n - 1) {
                    internasTexto.append(" + ");
                }
            }

            double integral = (h / 2.0) * (fx[0] + 2.0 * sumaInterna + fx[n]);
            txtResultado.setText(fmt.format(integral));

            StringBuilder proc = new StringBuilder();
            proc.append("h = (b-a)/n\n");
            proc.append("h = (").append(fmt.format(b)).append(" - ").append(fmt.format(a)).append(")/").append(n).append("\n");
            proc.append("h = ").append(fmt.format(h)).append("\n\n");
            proc.append("I = h/2 [f(x0) + 2(").append(internasTexto).append(") + f(x").append(n).append(")]\n");
            proc.append("I = ").append(fmt.format(h)).append("/2 [").append(fmt.format(fx[0]))
                    .append(" + 2(").append(fmt.format(sumaInterna)).append(") + ").append(fmt.format(fx[n])).append("]\n");
            proc.append("Resultado = ").append(fmt.format(integral));
            txtProcedimiento.setText(proc.toString());

            panelGrafica.setDatos(x, fx);
        } catch (IllegalArgumentException ex) {
            mostrarError(ex.getMessage());
        } catch (ArithmeticException ex) {
            mostrarError("Error numérico durante el cálculo: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtInferior.setText("");
        txtSuperior.setText("");
        txtSegmentos.setText("");
        txtResultado.setText("");
        txtProcedimiento.setText("Ingrese límites, segmentos y presione Generar Tabla.");
        tblDatos.setModel(new DefaultTableModel(new Object[][]{}, new String[]{"i", "Xi", "f(Xi)"}));
        centrarColumnas();
        panelGrafica.setDatos(new double[0], new double[0]);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Validación", JOptionPane.ERROR_MESSAGE);
    }

    private void finalizarEdicionTabla() {
        if (tblDatos.isEditing() && tblDatos.getCellEditor() != null) {
            if (!tblDatos.getCellEditor().stopCellEditing()) {
                tblDatos.getCellEditor().cancelCellEditing();
            }
        }
    }

    private double leerNumero(String valor, String campo) {
        if (valor == null || valor.trim().isEmpty()) {
            throw new IllegalArgumentException("El campo " + campo + " está vacío.");
        }
        try {
            return Double.parseDouble(valor.trim().replace(',', '.'));
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("El campo " + campo + " debe ser numérico.");
        }
    }

    private int leerSegmentos(String valor) {
        double nDouble = leerNumero(valor, "segmentos");
        if (Math.floor(nDouble) != nDouble) {
            throw new IllegalArgumentException("El número de segmentos debe ser entero.");
        }
        int n = (int) nDouble;
        if (n < 1 || n > MAX_SEGMENTOS) {
            throw new IllegalArgumentException("El número de segmentos debe estar entre 1 y " + MAX_SEGMENTOS + ".");
        }
        return n;
    }

    private void centrarColumnas() {
        tblDatos.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 13));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel lblInferior;
    private javax.swing.JLabel lblProcedimiento;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblSegmentos;
    private javax.swing.JLabel lblSuperior;
    private javax.swing.JLabel lblTitulo;
    private reglatrapezoidal.PanelGrafica panelGrafica;
    private javax.swing.JPanel pnlRoot;
    private javax.swing.JScrollPane scrollProcedimiento;
    private javax.swing.JScrollPane scrollTabla;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtInferior;
    private javax.swing.JTextArea txtProcedimiento;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtSegmentos;
    private javax.swing.JTextField txtSuperior;
    // End of variables declaration//GEN-END:variables
}
