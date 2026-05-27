package reglatrapezoidal;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class FrmTrapezoidal extends javax.swing.JFrame {

    private static final int MAX_SEGMENTOS = 6;
    private static final Color COLOR_BG = new Color(22, 25, 32);
    private static final Color COLOR_SURFACE = new Color(30, 34, 43);
    private static final Color COLOR_SURFACE_ALT = new Color(38, 43, 54);
    private static final Color COLOR_BORDER = new Color(58, 64, 78);
    private static final Color COLOR_TEXT = new Color(230, 234, 240);
    private static final Color COLOR_TEXT_MUTED = new Color(160, 168, 182);
    private static final Color COLOR_ACCENT = new Color(72, 123, 255);
    private static final Color COLOR_ACCENT_BORDER = new Color(58, 104, 220);
    private static final Color COLOR_SUCCESS = new Color(46, 204, 113);
    private static final Color COLOR_SUCCESS_HOVER = new Color(72, 222, 130);
    private static final Color COLOR_SUCCESS_BORDER = new Color(36, 175, 95);
    private static final Color COLOR_DANGER = new Color(231, 76, 60);
    private static final Color COLOR_DANGER_HOVER = new Color(239, 96, 80);
    private static final Color COLOR_DANGER_BORDER = new Color(200, 60, 48);
    private static final Color COLOR_SURFACE_ZEBRA = new Color(34, 39, 49);
    private static final Font FONT_TITLE = new Font("Segoe UI", Font.BOLD, 26);
    private static final Font FONT_MONO_PLAIN = new Font("Consolas", Font.PLAIN, 14);
    private static final Font FONT_MONO_BOLD = new Font("Consolas", Font.BOLD, 18);
    private static final double MIN_TOLERANCE = 1e-5;
    private static final double TOLERANCE_SCALE = 1e-6;
    private final DecimalFormat fmt = new DecimalFormat("0.######");

    public FrmTrapezoidal() {
        initComponents();
        getContentPane().setBackground(COLOR_BG);
        tblDatos.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
        aplicarEstilos();
        setMinimumSize(new java.awt.Dimension(1080, 760));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRoot = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblEntrada = new javax.swing.JLabel();
        lblInferior = new javax.swing.JLabel();
        txtInferior = new javax.swing.JTextField();
        lblSuperior = new javax.swing.JLabel();
        txtSuperior = new javax.swing.JTextField();
        lblSegmentos = new javax.swing.JLabel();
        txtSegmentos = new javax.swing.JTextField();
        lblAcciones = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        sepContenido = new javax.swing.JSeparator();
        scrollTabla = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        scrollProcedimiento = new javax.swing.JScrollPane();
        txtProcedimiento = new javax.swing.JTextArea();
        lblTabla = new javax.swing.JLabel();
        lblProcedimiento = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        lblGrafica = new javax.swing.JLabel();
        panelGrafica = new reglatrapezoidal.PanelGrafica();
        sepHeader = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Método Trapezoidal Compuesto");
        setResizable(true);

        pnlRoot.setBackground(new java.awt.Color(22, 25, 32));
        pnlRoot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(58, 64, 78)));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(230, 234, 240));
        lblTitulo.setText("Regla Trapezoidal Compuesta");

        lblEntrada.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEntrada.setForeground(new java.awt.Color(160, 168, 182));
        lblEntrada.setText("Entrada de datos");

        lblInferior.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblInferior.setForeground(new java.awt.Color(230, 234, 240));
        lblInferior.setText("Límite inferior (a)");

        txtInferior.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblSuperior.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSuperior.setForeground(new java.awt.Color(230, 234, 240));
        lblSuperior.setText("Límite superior (b)");

        txtSuperior.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblSegmentos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSegmentos.setForeground(new java.awt.Color(230, 234, 240));
        lblSegmentos.setText("Segmentos (n <= 6)");

        txtSegmentos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblAcciones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAcciones.setForeground(new java.awt.Color(160, 168, 182));
        lblAcciones.setText("Acciones");

        btnGenerar.setBackground(new java.awt.Color(72, 123, 255));
        btnGenerar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGenerar.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerar.setText("Generar Tabla");
        btnGenerar.setBorderPainted(false);
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        btnCalcular.setBackground(new java.awt.Color(46, 204, 113));
        btnCalcular.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("Calcular");
        btnCalcular.setBorderPainted(false);
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(231, 76, 60));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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

        lblTabla.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTabla.setForeground(new java.awt.Color(160, 168, 182));
        lblTabla.setText("Tabla de valores");

        lblProcedimiento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblProcedimiento.setForeground(new java.awt.Color(160, 168, 182));
        lblProcedimiento.setText("Procedimiento");

        lblResultado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(160, 168, 182));
        lblResultado.setText("Resultado final");

        txtResultado.setEditable(false);
        txtResultado.setBackground(new java.awt.Color(38, 43, 54));
        txtResultado.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(230, 234, 240));

        lblGrafica.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblGrafica.setForeground(new java.awt.Color(160, 168, 182));
        lblGrafica.setText("Gráfica");

        panelGrafica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(58, 64, 78)));

        javax.swing.GroupLayout pnlRootLayout = new javax.swing.GroupLayout(pnlRoot);
        pnlRoot.setLayout(pnlRootLayout);
        pnlRootLayout.setHorizontalGroup(
            pnlRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRootLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnlRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo)
                    .addComponent(sepHeader)
                    .addComponent(lblEntrada)
                    .addGroup(pnlRootLayout.createSequentialGroup()
                        .addGroup(pnlRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblInferior)
                            .addComponent(txtInferior, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(pnlRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSuperior)
                            .addComponent(txtSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(pnlRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSegmentos)
                            .addComponent(txtSegmentos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblAcciones)
                    .addGroup(pnlRootLayout.createSequentialGroup()
                        .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sepContenido)
                    .addGroup(pnlRootLayout.createSequentialGroup()
                        .addGroup(pnlRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTabla)
                            .addComponent(scrollTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlRootLayout.createSequentialGroup()
                                .addComponent(lblResultado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtResultado))
                            .addComponent(lblProcedimiento)
                            .addComponent(scrollProcedimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(pnlRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGrafica)
                            .addComponent(panelGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28))
        );
        pnlRootLayout.setVerticalGroup(
            pnlRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRootLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblTitulo)
                .addGap(10, 10, 10)
                .addComponent(sepHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblEntrada)
                .addGap(8, 8, 8)
                .addGroup(pnlRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInferior)
                    .addComponent(lblSuperior)
                    .addComponent(lblSegmentos))
                .addGap(6, 6, 6)
                .addGroup(pnlRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInferior, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSegmentos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(lblAcciones)
                .addGap(8, 8, 8)
                .addGroup(pnlRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(sepContenido, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(pnlRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRootLayout.createSequentialGroup()
                        .addComponent(lblTabla)
                        .addGap(8, 8, 8)
                        .addComponent(scrollTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(pnlRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblResultado)
                            .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(lblProcedimiento)
                        .addGap(6, 6, 6)
                        .addComponent(scrollProcedimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlRootLayout.createSequentialGroup()
                        .addComponent(lblGrafica)
                        .addGap(8, 8, 8)
                        .addComponent(panelGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
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

            DefaultTableModel model = crearModeloTabla();

            double h = (b - a) / n;
            for (int i = 0; i <= n; i++) {
                double xi = a + (i * h);
                model.addRow(new Object[]{i, xi, ""});
            }

            tblDatos.setModel(model);
            centrarColumnas();
            txtResultado.setText("");
            txtProcedimiento.setText("Tabla generada con n = " + n + " segmentos.\n"
                    + "Complete o corrija valores de Xi y f(Xi), luego presione Calcular.");
            panelGrafica.setDatos(new double[0], new double[0]);
            btnCalcular.setEnabled(true);
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
                x[i] = leerNumero(xObj, "Xi en fila " + i);
                fx[i] = leerNumero(fObj, "f(Xi) en fila " + i);
            }

            double a = leerNumero(txtInferior.getText(), "límite inferior");
            double b = leerNumero(txtSuperior.getText(), "límite superior");
            double h = (b - a) / n;
            validarEspaciadoUniforme(x, a, b, n);

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
        tblDatos.setModel(crearModeloTabla());
        centrarColumnas();
        panelGrafica.setDatos(new double[0], new double[0]);
        btnCalcular.setEnabled(false);
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

    private double leerNumero(Object valor, String campo) {
        if (valor instanceof Number number) {
            return number.doubleValue();
        }
        return leerNumero(valor == null ? null : valor.toString(), campo);
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

    private void aplicarEstilos() {
        pnlRoot.setBackground(COLOR_BG);
        pnlRoot.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(COLOR_BORDER),
                BorderFactory.createEmptyBorder(18, 18, 18, 18)));

        lblTitulo.setFont(FONT_TITLE);
        lblTitulo.setForeground(COLOR_TEXT);
        lblEntrada.setForeground(COLOR_TEXT_MUTED);
        lblAcciones.setForeground(COLOR_TEXT_MUTED);
        lblTabla.setForeground(COLOR_TEXT_MUTED);
        lblGrafica.setForeground(COLOR_TEXT_MUTED);
        lblProcedimiento.setForeground(COLOR_TEXT_MUTED);
        lblResultado.setForeground(COLOR_TEXT_MUTED);
        lblInferior.setForeground(COLOR_TEXT);
        lblSuperior.setForeground(COLOR_TEXT);
        lblSegmentos.setForeground(COLOR_TEXT);
        lblSegmentos.setText("Segmentos (1 - " + MAX_SEGMENTOS + ")");

        configurarCampo(txtInferior, SwingConstants.CENTER);
        configurarCampo(txtSuperior, SwingConstants.CENTER);
        configurarCampo(txtSegmentos, SwingConstants.CENTER);
        configurarCampo(txtResultado, SwingConstants.RIGHT);
        txtResultado.setBackground(COLOR_SURFACE_ALT);
        txtResultado.setFont(FONT_MONO_BOLD);
        txtResultado.setEditable(false);

        txtProcedimiento.setFont(FONT_MONO_PLAIN);
        txtProcedimiento.setText("Ingrese límites, segmentos y presione Generar Tabla.");
        txtProcedimiento.setEditable(false);
        txtProcedimiento.setForeground(COLOR_TEXT);
        txtProcedimiento.setBackground(COLOR_SURFACE);
        txtProcedimiento.setCaretColor(COLOR_TEXT);
        txtProcedimiento.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(COLOR_BORDER),
                BorderFactory.createEmptyBorder(10, 12, 10, 12)));

        configurarBoton(btnGenerar, COLOR_ACCENT, COLOR_ACCENT.brighter(), COLOR_ACCENT_BORDER);
        configurarBoton(btnCalcular, COLOR_SUCCESS, COLOR_SUCCESS_HOVER, COLOR_SUCCESS_BORDER);
        configurarBoton(btnLimpiar, COLOR_DANGER, COLOR_DANGER_HOVER, COLOR_DANGER_BORDER);

        sepHeader.setForeground(COLOR_BORDER);
        sepHeader.setBackground(COLOR_BORDER);
        sepContenido.setForeground(COLOR_BORDER);
        sepContenido.setBackground(COLOR_BORDER);

        btnGenerar.setToolTipText("Genera la tabla de Xi según los límites y segmentos.");
        btnCalcular.setToolTipText("Calcula la integral con los valores de la tabla.");
        btnLimpiar.setToolTipText("Limpia todos los campos y reinicia la tabla.");
        txtInferior.setToolTipText("Ingrese el límite inferior a.");
        txtSuperior.setToolTipText("Ingrese el límite superior b.");
        txtSegmentos.setToolTipText("Número de segmentos (1 a " + MAX_SEGMENTOS + ").");
        tblDatos.setToolTipText("Ingrese los valores de Xi y f(Xi) para cada segmento.");
        panelGrafica.setToolTipText("Visualización de la regla trapezoidal.");

        scrollTabla.setBorder(BorderFactory.createLineBorder(COLOR_BORDER));
        scrollProcedimiento.setBorder(BorderFactory.createLineBorder(COLOR_BORDER));
        panelGrafica.setBorder(BorderFactory.createLineBorder(COLOR_BORDER));

        tblDatos.setModel(crearModeloTabla());
        tblDatos.setRowHeight(26);
        tblDatos.setForeground(COLOR_TEXT);
        tblDatos.setBackground(COLOR_SURFACE);
        tblDatos.setGridColor(COLOR_BORDER);
        tblDatos.setSelectionBackground(new Color(74, 115, 198));
        tblDatos.setSelectionForeground(Color.WHITE);
        tblDatos.setShowVerticalLines(true);

        getRootPane().setDefaultButton(btnGenerar);
        btnCalcular.setEnabled(false);
        centrarColumnas();
    }

    private DefaultTableModel crearModeloTabla() {
        return new DefaultTableModel(new Object[][]{}, new String[]{"i", "Xi", "f(Xi)"}) {
            @Override
            public boolean isCellEditable(int row, int col) {
                return col != 0;
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                if (columnIndex == 0) {
                    return Integer.class;
                }
                return Object.class;
            }
        };
    }

    private void validarEspaciadoUniforme(double[] x, double a, double b, int n) {
        double tolerancia = Math.max(MIN_TOLERANCE, Math.abs(b - a) * TOLERANCE_SCALE);
        if (Math.abs(x[0] - a) > tolerancia || Math.abs(x[n] - b) > tolerancia) {
            throw new IllegalArgumentException("Los valores de Xi deben iniciar en a y terminar en b.");
        }
        double hEsperado = (b - a) / n;
        for (int i = 1; i <= n; i++) {
            double paso = x[i] - x[i - 1];
            if (paso <= 0) {
                throw new IllegalArgumentException("Los valores de Xi deben ser crecientes.");
            }
            if (Math.abs(paso - hEsperado) > tolerancia) {
                throw new IllegalArgumentException("Los valores de Xi deben estar equidistantes.");
            }
        }
    }

    private void centrarColumnas() {
        JTableHeader header = tblDatos.getTableHeader();
        header.setFont(new Font("Segoe UI", Font.BOLD, 13));
        header.setBackground(COLOR_SURFACE_ALT);
        header.setForeground(COLOR_TEXT);
        header.setReorderingAllowed(false);

        tblDatos.setDefaultRenderer(Object.class, new TablaRenderer());
        tblDatos.setDefaultRenderer(Number.class, new TablaRenderer());
        tblDatos.getColumnModel().getColumn(0).setPreferredWidth(40);
        tblDatos.getColumnModel().getColumn(1).setPreferredWidth(120);
        tblDatos.getColumnModel().getColumn(2).setPreferredWidth(120);
    }

    private void configurarCampo(javax.swing.JTextField field, int alignment) {
        field.setBackground(COLOR_SURFACE);
        field.setForeground(COLOR_TEXT);
        field.setCaretColor(COLOR_TEXT);
        field.setHorizontalAlignment(alignment);
        field.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(COLOR_BORDER),
                BorderFactory.createEmptyBorder(8, 12, 8, 12)));
    }

    private void configurarBoton(javax.swing.JButton button, Color base, Color hover, Color border) {
        button.setBackground(base);
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(border),
                BorderFactory.createEmptyBorder(10, 18, 10, 18)));
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (button.isEnabled()) {
                    button.setBackground(hover);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (button.isEnabled()) {
                    button.setBackground(base);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                if (button.isEnabled()) {
                    button.setBackground(hover.darker());
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (button.isEnabled()) {
                    button.setBackground(hover);
                }
            }
        });
    }

    private class TablaRenderer extends DefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(javax.swing.JTable table, Object value, boolean isSelected,
                boolean hasFocus, int row, int column) {
            Object valor = value;
            if (value == null) {
                valor = "";
            } else if (value instanceof Number) {
                valor = fmt.format(((Number) value).doubleValue());
            }
            Component comp = super.getTableCellRendererComponent(table, valor, isSelected, hasFocus, row, column);
            if (!isSelected) {
                comp.setBackground(row % 2 == 0 ? COLOR_SURFACE : COLOR_SURFACE_ZEBRA);
                comp.setForeground(COLOR_TEXT);
            } else {
                comp.setForeground(table.getSelectionForeground());
            }
            if (comp instanceof JLabel label) {
                if (column == 0) {
                    label.setHorizontalAlignment(SwingConstants.CENTER);
                } else {
                    label.setHorizontalAlignment(SwingConstants.RIGHT);
                }
            } else {
                setHorizontalAlignment(column == 0 ? SwingConstants.CENTER : SwingConstants.RIGHT);
            }
            return comp;
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel lblAcciones;
    private javax.swing.JLabel lblEntrada;
    private javax.swing.JLabel lblGrafica;
    private javax.swing.JLabel lblInferior;
    private javax.swing.JLabel lblProcedimiento;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblSegmentos;
    private javax.swing.JLabel lblSuperior;
    private javax.swing.JLabel lblTabla;
    private javax.swing.JLabel lblTitulo;
    private reglatrapezoidal.PanelGrafica panelGrafica;
    private javax.swing.JPanel pnlRoot;
    private javax.swing.JScrollPane scrollProcedimiento;
    private javax.swing.JScrollPane scrollTabla;
    private javax.swing.JSeparator sepContenido;
    private javax.swing.JSeparator sepHeader;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtInferior;
    private javax.swing.JTextArea txtProcedimiento;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtSegmentos;
    private javax.swing.JTextField txtSuperior;
    // End of variables declaration//GEN-END:variables
}
