package cgra.Frame;

import cgra.Components.NonEditableTableModel;
import cgra.Components.Plane;
import cgra.Math.TransformationUtils;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Main extends JFrame {
    private final JLabel lblCoordinates;
    private static ArrayList<Plane> lineDataGrid;
    private Plane selectedPlane;

    public Main() {
        initComponents();

        lineDataGrid = new ArrayList<>();
        selectedPlane = null;

        pnlRadar.setBackground(Color.WHITE);
        pnlRadar.setPreferredSize(new Dimension(400, 400));
        pnlRadar.setLayout(null);

        lblCoordinates = new JLabel("X: 0, Y: 0");
        lblCoordinates.setBounds(5, 5, 200, 30);
        lblCoordinates.setForeground(Color.RED);
        pnlRadar.add(lblCoordinates);

        pnlRadar.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                int x = e.getX() - pnlRadar.getWidth() / 2;
                int y = pnlRadar.getHeight() / 2 - e.getY();
                lblCoordinates.setText(String.format("X: %d, Y: %d", x, y));
            }
        });

        pnlRadar.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent evt) {
                int x = evt.getX() - pnlRadar.getWidth() / 2;
                int y = pnlRadar.getHeight() / 2 - evt.getY();

                boolean ctrlPressed = (evt.getModifiersEx() & MouseEvent.CTRL_DOWN_MASK) != 0;

                if (!ctrlPressed) {
                    grdData.clearSelection();
                }

                for (int i = 0; i < lineDataGrid.size(); i++) {
                    Plane plane = lineDataGrid.get(i);
                    if (Math.abs(plane.getX() - x) < 15 && Math.abs(plane.getY() - y) < 15) {
                        grdData.addRowSelectionInterval(i, i);
                        break;
                    }
                }
            }
        });

        pack();
        setLocationRelativeTo(null);

        atualizarRadar();
    }

    private void initComponents() {//GEN-BEGIN:initComponents
        pnlRadar = new JPanel();
        pnlEntradaDados = new JPanel();
        lblEntradaDados = new JLabel();
        lblEDX = new JLabel();
        edtEDX = new JTextField();
        lblEDX1 = new JLabel();
        edtEDRaio = new JTextField();
        lblEDX2 = new JLabel();
        edtEDVelocidade = new JTextField();
        lblEDX3 = new JLabel();
        edtEDY = new JTextField();
        lblEDX4 = new JLabel();
        edtEDAngulo = new JTextField();
        lblEDX5 = new JLabel();
        edtEDDirecao = new JTextField();
        btnEDInserir = new JButton();
        chkOpc = new JCheckBox();
        pnlFuncTrans = new JPanel();
        lblEntradaDados1 = new JLabel();
        pnlTransladar = new JPanel();
        lblEDX6 = new JLabel();
        edtFSX = new JTextField();
        lblEDX7 = new JLabel();
        edtFSY = new JTextField();
        btnFSTrans = new JButton();
        pnlTransladar1 = new JPanel();
        lblEDX8 = new JLabel();
        edtFSX2 = new JTextField();
        lblEDX9 = new JLabel();
        edtFSY2 = new JTextField();
        btnFSEsc = new JButton();
        jPanel1 = new JPanel();
        lblEDX10 = new JLabel();
        edtFSAng = new JTextField();
        lblEDX11 = new JLabel();
        btnFSRot = new JButton();
        lblEDX13 = new JLabel();
        lblEDX12 = new JLabel();
        edtFSX3 = new JTextField();
        edtFSY3 = new JTextField();
        jPanel2 = new JPanel();
        lblEntradaDados3 = new JLabel();
        jScrollPane1 = new JScrollPane();
        grdData = new JTable();
        jPanel3 = new JPanel();
        lblEntradaDados4 = new JLabel();
        jScrollPane2 = new JScrollPane();
        memRelatorio = new JTextArea();
        lblEntradaDados2 = new JLabel();
        pnlFuncTrans1 = new JPanel();
        lblEntradaDados5 = new JLabel();
        pnlTransladar2 = new JPanel();
        lblEDX14 = new JLabel();
        edtFRDM1 = new JTextField();
        btnFRProxAE = new JButton();
        pnlTransladar3 = new JPanel();
        lblEDX15 = new JLabel();
        edtFRDM2 = new JTextField();
        btnFRProx = new JButton();
        pnlTransladar4 = new JPanel();
        lblEDX16 = new JLabel();
        edtFRTM = new JTextField();
        btnFRColisao = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        pnlRadar.setBackground(new Color(204, 0, 0));
        pnlRadar.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        pnlRadar.setPreferredSize(new Dimension(400, 400));

        GroupLayout pnlRadarLayout = new GroupLayout(pnlRadar);
        pnlRadar.setLayout(pnlRadarLayout);
        pnlRadarLayout.setHorizontalGroup(
                pnlRadarLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 398, Short.MAX_VALUE)
        );
        pnlRadarLayout.setVerticalGroup(
                pnlRadarLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 398, Short.MAX_VALUE)
        );

        pnlEntradaDados.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        lblEntradaDados.setFont(new Font("Segoe UI", Font.BOLD, 18)); // NOI18N
        lblEntradaDados.setText("Entrada de Dados");

        lblEDX.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        lblEDX.setText("X:");

        edtEDX.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N

        lblEDX1.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        lblEDX1.setText("Raio:");

        edtEDRaio.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
        edtEDRaio.setEnabled(false);

        lblEDX2.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        lblEDX2.setText("Velocidade:");

        edtEDVelocidade.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N

        lblEDX3.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        lblEDX3.setText("Y:");

        edtEDY.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N

        lblEDX4.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        lblEDX4.setText("Ângulo:");

        edtEDAngulo.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
        edtEDAngulo.setEnabled(false);

        lblEDX5.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        lblEDX5.setText("Direção:");

        edtEDDirecao.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N

        btnEDInserir.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        btnEDInserir.setText("Inserir");
        btnEDInserir.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                btnEDInserirMouseClicked(evt);
            }
        });

        chkOpc.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        chkOpc.setText("Cartesiano");
        chkOpc.setHorizontalAlignment(SwingConstants.RIGHT);
        chkOpc.setHorizontalTextPosition(SwingConstants.LEFT);
        chkOpc.addItemListener(this::chkOpcItemStateChanged);

        GroupLayout pnlEntradaDadosLayout = new GroupLayout(pnlEntradaDados);
        pnlEntradaDados.setLayout(pnlEntradaDadosLayout);
        pnlEntradaDadosLayout.setHorizontalGroup(
                pnlEntradaDadosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(pnlEntradaDadosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlEntradaDadosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlEntradaDadosLayout.createSequentialGroup()
                                                .addGroup(pnlEntradaDadosLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(lblEDX1)
                                                        .addComponent(lblEDX2)
                                                        .addComponent(lblEDX, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnlEntradaDadosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(pnlEntradaDadosLayout.createSequentialGroup()
                                                                .addComponent(edtEDRaio, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(14, 14, 14)
                                                                .addComponent(lblEDX4, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(pnlEntradaDadosLayout.createSequentialGroup()
                                                                .addComponent(edtEDX, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(lblEDX3, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)))
                                                .addGap(2, 2, 2)
                                                .addGroup(pnlEntradaDadosLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(edtEDAngulo, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                                        .addComponent(edtEDY)))
                                        .addGroup(pnlEntradaDadosLayout.createSequentialGroup()
                                                .addGroup(pnlEntradaDadosLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(pnlEntradaDadosLayout.createSequentialGroup()
                                                                .addGap(85, 85, 85)
                                                                .addComponent(edtEDVelocidade, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(chkOpc, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblEDX5, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnlEntradaDadosLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btnEDInserir, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                                        .addComponent(edtEDDirecao))))
                                .addContainerGap(33, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, pnlEntradaDadosLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblEntradaDados)
                                .addGap(105, 105, 105))
        );
        pnlEntradaDadosLayout.setVerticalGroup(
                pnlEntradaDadosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(pnlEntradaDadosLayout.createSequentialGroup()
                                .addComponent(lblEntradaDados)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlEntradaDadosLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblEDX)
                                        .addComponent(edtEDX, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblEDX3)
                                        .addComponent(edtEDY, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlEntradaDadosLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblEDX1)
                                        .addComponent(edtEDRaio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblEDX4)
                                        .addComponent(edtEDAngulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlEntradaDadosLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblEDX2)
                                        .addComponent(edtEDVelocidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblEDX5)
                                        .addComponent(edtEDDirecao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlEntradaDadosLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnEDInserir)
                                        .addComponent(chkOpc))
                                .addGap(0, 22, Short.MAX_VALUE))
        );

        lblEntradaDados1.setFont(new Font("Segoe UI", Font.BOLD, 18)); // NOI18N
        lblEntradaDados1.setText("Funções de Transformação");

        pnlTransladar.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        lblEDX6.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        lblEDX6.setText("X:");

        edtFSX.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N

        lblEDX7.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        lblEDX7.setText("Y:");

        edtFSY.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N

        btnFSTrans.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        btnFSTrans.setText("Transladar");

        btnFSTrans.addActionListener(_ -> {
            try {
                double transX = parseDoubleOrDefault(edtFSX.getText(), 0.0);
                double transY = parseDoubleOrDefault(edtFSY.getText(), 0.0);
                TransformationUtils.translatePlanes(lineDataGrid, grdData, transX, transY);
                updateRadar();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao transladar: " + ex.getMessage());
            }
        });

        GroupLayout pnlTransladarLayout = new GroupLayout(pnlTransladar);
        pnlTransladar.setLayout(pnlTransladarLayout);
        pnlTransladarLayout.setHorizontalGroup(
                pnlTransladarLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(pnlTransladarLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlTransladarLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlTransladarLayout.createSequentialGroup()
                                                .addComponent(lblEDX6, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(edtFSX, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblEDX7, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(edtFSY, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 12, Short.MAX_VALUE))
                                        .addComponent(btnFSTrans, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        pnlTransladarLayout.setVerticalGroup(
                pnlTransladarLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(pnlTransladarLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlTransladarLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblEDX6)
                                        .addComponent(edtFSX, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblEDX7)
                                        .addComponent(edtFSY, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnFSTrans)
                                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnlTransladar1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        lblEDX8.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        lblEDX8.setText("X:");

        edtFSX2.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N

        lblEDX9.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        lblEDX9.setText("Y:");

        edtFSY2.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N

        btnFSEsc.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        btnFSEsc.setText("Escalonar");

        btnFSEsc.addActionListener(_ -> {
            try {
                double scaleX = parseDoubleOrDefault(edtFSX2.getText(), 1.0);
                double scaleY = parseDoubleOrDefault(edtFSY2.getText(), 1.0);
                TransformationUtils.scalePlanes(lineDataGrid, grdData, scaleX, scaleY);
                updateRadar();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao escalonar: " + ex.getMessage());
            }
        });

        GroupLayout pnlTransladar1Layout = new GroupLayout(pnlTransladar1);
        pnlTransladar1.setLayout(pnlTransladar1Layout);
        pnlTransladar1Layout.setHorizontalGroup(
                pnlTransladar1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(pnlTransladar1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlTransladar1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlTransladar1Layout.createSequentialGroup()
                                                .addComponent(btnFSEsc, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap())
                                        .addGroup(pnlTransladar1Layout.createSequentialGroup()
                                                .addComponent(lblEDX8, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(edtFSX2, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblEDX9, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(edtFSY2, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 20, Short.MAX_VALUE))))
        );

        pnlTransladar1Layout.setVerticalGroup(
                pnlTransladar1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(pnlTransladar1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlTransladar1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblEDX8)
                                        .addComponent(edtFSX2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblEDX9)
                                        .addComponent(edtFSY2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnFSEsc)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        lblEDX10.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        lblEDX10.setText("Ângulo:");

        edtFSAng.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N

        lblEDX11.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        lblEDX11.setText("Centro de Rotação");

        btnFSRot.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        btnFSRot.setText("Rotacionar");

        btnFSRot.addActionListener(e -> {
            try {
                double angle = parseDoubleOrDefault(edtFSAng.getText(), 0.0);
                double centerX = parseDoubleOrDefault(edtFSX3.getText(), 0.0);
                double centerY = parseDoubleOrDefault(edtFSY3.getText(), 0.0);
                TransformationUtils.rotatePlanes(lineDataGrid, grdData, angle, centerX, centerY);
                updateRadar();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao rotacionar: " + ex.getMessage());
            }
        });

        lblEDX13.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        lblEDX13.setText("Y:");

        lblEDX12.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        lblEDX12.setText("X:");

        edtFSX3.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N

        edtFSY3.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblEDX10, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(edtFSAng)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblEDX11))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnFSRot, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblEDX12, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(edtFSX3, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblEDX13, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(edtFSY3, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblEDX10)
                                        .addComponent(edtFSAng)
                                        .addComponent(lblEDX11))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(btnFSRot, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(lblEDX12)
                                                .addComponent(edtFSX3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblEDX13)
                                                .addComponent(edtFSY3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(20, Short.MAX_VALUE))
        );

        GroupLayout pnlFuncTransLayout = new GroupLayout(pnlFuncTrans);
        pnlFuncTrans.setLayout(pnlFuncTransLayout);
        pnlFuncTransLayout.setHorizontalGroup(
                pnlFuncTransLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, pnlFuncTransLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblEntradaDados1)
                                .addGap(71, 71, 71))
                        .addGroup(pnlFuncTransLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlFuncTransLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(pnlFuncTransLayout.createSequentialGroup()
                                                .addComponent(pnlTransladar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(pnlTransladar1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        pnlFuncTransLayout.setVerticalGroup(
                pnlFuncTransLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(pnlFuncTransLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblEntradaDados1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlFuncTransLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(pnlTransladar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pnlTransladar1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(30, Short.MAX_VALUE))
        );

        lblEntradaDados3.setFont(new Font("Segoe UI", Font.BOLD, 18)); // NOI18N
        lblEntradaDados3.setText("Data Grid");

        grdData.setModel(new NonEditableTableModel(
                new Object[][]{},
                new String[]{"ID", "X", "Y", "R", "A", "V", "D"}
        ));

        grdData.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                grdDataMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(grdData);

        lblEntradaDados4.setFont(new Font("Segoe UI", Font.BOLD, 18)); // NOI18N
        lblEntradaDados4.setText("Relatório");
        lblEntradaDados4.setToolTipText("");

        memRelatorio.setEditable(false);
        memRelatorio.setColumns(20);
        memRelatorio.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
        memRelatorio.setRows(5);
        jScrollPane2.setViewportView(memRelatorio);

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(lblEntradaDados4)
                                .addContainerGap(194, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2)
                                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblEntradaDados4)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                                .addContainerGap())
        );

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(lblEntradaDados3)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1)
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblEntradaDados3)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 403, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblEntradaDados2.setFont(new Font("Segoe UI", Font.BOLD, 18)); // NOI18N
        lblEntradaDados2.setText("Radar");

        lblEntradaDados5.setFont(new Font("Segoe UI", Font.BOLD, 18)); // NOI18N
        lblEntradaDados5.setText("Funções de Rastreamento");

        pnlTransladar2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        lblEDX14.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        lblEDX14.setText("Distância Mínima:");

        edtFRDM1.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N

        btnFRProxAE.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        btnFRProxAE.setText("Aviões Próximos ao Aeroporto");

        GroupLayout pnlTransladar2Layout = new GroupLayout(pnlTransladar2);
        pnlTransladar2.setLayout(pnlTransladar2Layout);
        pnlTransladar2Layout.setHorizontalGroup(
                pnlTransladar2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(pnlTransladar2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(lblEDX14, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtFRDM1, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(68, Short.MAX_VALUE))
                        .addGroup(pnlTransladar2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnFRProxAE, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        pnlTransladar2Layout.setVerticalGroup(
                pnlTransladar2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(pnlTransladar2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlTransladar2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(edtFRDM1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblEDX14))
                                .addGap(18, 18, 18)
                                .addComponent(btnFRProxAE, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(43, Short.MAX_VALUE))
        );

        pnlTransladar3.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        lblEDX15.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        lblEDX15.setText("Distância Mínima:");

        edtFRDM2.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N

        btnFRProx.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        btnFRProx.setText("Aviões Próximos");

        GroupLayout pnlTransladar3Layout = new GroupLayout(pnlTransladar3);
        pnlTransladar3.setLayout(pnlTransladar3Layout);
        pnlTransladar3Layout.setHorizontalGroup(
                pnlTransladar3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(pnlTransladar3Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(lblEDX15, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edtFRDM2, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(68, Short.MAX_VALUE))
                        .addGroup(pnlTransladar3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnFRProx, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        pnlTransladar3Layout.setVerticalGroup(
                pnlTransladar3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(pnlTransladar3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlTransladar3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(edtFRDM2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblEDX15))
                                .addGap(18, 18, 18)
                                .addComponent(btnFRProx, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(43, Short.MAX_VALUE))
        );

        pnlTransladar4.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        lblEDX16.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        lblEDX16.setText("Tempo Mínimo (seg):");

        edtFRTM.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // NOI18N

        btnFRColisao.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        btnFRColisao.setText("Em Rota de Colisão");
        btnFRColisao.setActionCommand("");

        GroupLayout pnlTransladar4Layout = new GroupLayout(pnlTransladar4);
        pnlTransladar4.setLayout(pnlTransladar4Layout);
        pnlTransladar4Layout.setHorizontalGroup(
                pnlTransladar4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(pnlTransladar4Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(lblEDX16, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edtFRTM, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(pnlTransladar4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnFRColisao, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        pnlTransladar4Layout.setVerticalGroup(
                pnlTransladar4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(pnlTransladar4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlTransladar4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(edtFRTM, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblEDX16))
                                .addGap(18, 18, 18)
                                .addComponent(btnFRColisao, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(29, Short.MAX_VALUE))
        );

        GroupLayout pnlFuncTrans1Layout = new GroupLayout(pnlFuncTrans1);
        pnlFuncTrans1.setLayout(pnlFuncTrans1Layout);
        pnlFuncTrans1Layout.setHorizontalGroup(
                pnlFuncTrans1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(pnlFuncTrans1Layout.createSequentialGroup()
                                .addGroup(pnlFuncTrans1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlFuncTrans1Layout.createSequentialGroup()
                                                .addGap(284, 284, 284)
                                                .addComponent(lblEntradaDados5))
                                        .addGroup(pnlFuncTrans1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(pnlTransladar2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(pnlFuncTrans1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(pnlTransladar4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(pnlTransladar3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFuncTrans1Layout.setVerticalGroup(
                pnlFuncTrans1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(pnlFuncTrans1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblEntradaDados5, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlFuncTrans1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(pnlTransladar2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pnlTransladar3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pnlTransladar4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(41, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(pnlEntradaDados, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(pnlFuncTrans, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(185, 185, 185)
                                                                .addComponent(lblEntradaDados2)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE))
                                                        .addComponent(pnlRadar, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(pnlFuncTrans1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(pnlEntradaDados, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(pnlFuncTrans, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(lblEntradaDados2)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(pnlRadar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(pnlFuncTrans1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }//GEN-END:initComponents

    private void btnEDInserirMouseClicked(MouseEvent evt) {//GEN-FIRST:event_btnEDInserirMouseClicked
        try {
            double liX = parseDoubleOrDefault(edtEDX.getText(), 0.0);
            double liY = parseDoubleOrDefault(edtEDY.getText(), 0.0);
            double liRadius = parseDoubleOrDefault(edtEDRaio.getText(), 0.0);
            double liAngle = parseDoubleOrDefault(edtEDAngulo.getText(), 0.0);
            double liSpeed = parseDoubleOrDefault(edtEDVelocidade.getText(), 0.0);
            double liDirection = parseDoubleOrDefault(edtEDDirecao.getText(), 0.0);

            if (liSpeed <= 0) {
                throw new Exception("É necessário que a velocidade seja um valor acima de 0.");
            }

            Plane newPlane = new Plane();
            newPlane.setSpeed(liSpeed);
            newPlane.setDirection(liDirection);

            if (!chkOpc.isSelected()) {
                newPlane.setX(liX);
                newPlane.setY(liY);
                newPlane.convertToPolar();
            } else {
                newPlane.setRadius(liRadius);
                newPlane.setAngle(liAngle);
                newPlane.convertToCartesian();
            }

            newPlane.setCode(generateCode());
            lineDataGrid.add(newPlane);

            DefaultTableModel model = (DefaultTableModel) grdData.getModel();
            model.addRow(new Object[]{
                    newPlane.getCode(),
                    newPlane.getX(),
                    newPlane.getY(),
                    newPlane.getRadius(),
                    newPlane.getAngle(),
                    newPlane.getSpeed(),
                    newPlane.getDirection()
            });

            updateRadar();
            resetEntradaDados();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnEDInserirMouseClicked

    private void chkOpcItemStateChanged(ItemEvent evt) {//GEN-FIRST:event_chkOpcItemStateChanged
        if (chkOpc.isSelected()) {
            chkOpc.setText("Polar");
        } else {
            chkOpc.setText("Cartesiano");
        }

        edtEDX.setEnabled(!chkOpc.isSelected());
        edtEDY.setEnabled(!chkOpc.isSelected());
        edtEDRaio.setEnabled(chkOpc.isSelected());
        edtEDAngulo.setEnabled(chkOpc.isSelected());
    }//GEN-LAST:event_chkOpcItemStateChanged

    private void grdDataMousePressed(MouseEvent evt) {//GEN-FIRST:event_grdDataMousePressed
        if (SwingUtilities.isRightMouseButton(evt)) {
            int row = grdData.rowAtPoint(evt.getPoint());

            if (row >= 0) {
                // Selecionar a linha clicada
                grdData.setRowSelectionInterval(row, row);

                int confirm = JOptionPane.showConfirmDialog(this, "Você deseja excluir este avião?", "Confirmação", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    // Remover a linha do modelo de dados
                    lineDataGrid.remove(row);
                    DefaultTableModel model = (DefaultTableModel) grdData.getModel();
                    model.removeRow(row);

                    updateRadar();
                }
            }
        }
    }//GEN-LAST:event_grdDataMousePressed

    public final void atualizarRadar() {
        pnlRadar.removeAll();
        generateLayoutRadar();
        pnlRadar.add(lblCoordinates);
        pnlRadar.revalidate();
        pnlRadar.repaint();
    }

    public void resetEntradaDados() {
        edtEDX.setText("");
        edtEDY.setText("");
        edtEDRaio.setText("");
        edtEDAngulo.setText("");
        edtEDVelocidade.setText("");
        edtEDDirecao.setText("");
    }

    private void generateLayoutRadar() {
        for (int i = 1; i <= 7; i++) {
            JSeparator sep = new JSeparator();
            sep.setBounds(0, i * 50, pnlRadar.getWidth(), 5);
            pnlRadar.add(sep);
        }

        for (int i = 1; i <= 7; i++) {
            JSeparator sep = new JSeparator(SwingConstants.VERTICAL);
            sep.setBounds(i * 50, 0, 5, pnlRadar.getHeight());
            pnlRadar.add(sep);
        }

        JLabel point = new JLabel();
        point.setOpaque(true);
        point.setBackground(Color.RED);
        point.setBounds(195, 195, 12, 12);
        pnlRadar.add(point);
    }

    public double parseDoubleOrDefault(String value, double defaultValue) {
        if (value == null || value.trim().isEmpty()) {
            return defaultValue;
        }
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }

    private int generateCode() {
        if (lineDataGrid == null || lineDataGrid.isEmpty()) {
            return 1;
        }
        return lineDataGrid.stream().mapToInt(Plane::getCode).max().orElse(0) + 1;
    }

    public final void updateRadar() {

        this.pnlRadar.removeAll();

        for (int i = 0; i < grdData.getRowCount(); i++) {
            try {
                JLabel label = getImage(lineDataGrid.get(i));
                pnlRadar.add(label);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

        generateLayoutRadar();
        pnlRadar.add(lblCoordinates);
        pnlRadar.revalidate();
        pnlRadar.repaint();
    }

    private JLabel getImage(Plane plane) throws IOException {
        URL url = getClass().getResource("../images/plane.png");

        assert url != null;
        BufferedImage img = ImageIO.read(url);
        img = rotateImage(img, -1 * (plane.getDirection() - 45.0));

        Icon icon = new ImageIcon(img);
        JLabel label = new JLabel(icon);

        int x = 200 + (int) plane.getX();
        int y = 200 - (int) plane.getY();

        label.setBounds(x - 15, y - 15, 30, 30);
        return label;
    }

    public static BufferedImage rotateImage(BufferedImage image, double angle) {
        angle = angle % 360;
        if (angle < 0) {
            angle += 360;
        }

        AffineTransform tx = new AffineTransform();
        tx.rotate(Math.toRadians(angle), image.getWidth() / 2.0, image.getHeight() / 2.0);

        double xtrans, ytrans;
        if (angle <= 90) {
            xtrans = tx.transform(new Point2D.Double(0, image.getHeight()), null).getX();
            ytrans = tx.transform(new Point2D.Double(0.0, 0.0), null).getY();
        } else if (angle <= 180) {
            xtrans = tx.transform(new Point2D.Double(image.getWidth(), image.getHeight()), null).getX();
            ytrans = tx.transform(new Point2D.Double(0, image.getHeight()), null).getY();
        } else if (angle <= 270) {
            xtrans = tx.transform(new Point2D.Double(image.getWidth(), 0), null).getX();
            ytrans = tx.transform(new Point2D.Double(image.getWidth(), image.getHeight()), null).getY();
        } else {
            xtrans = tx.transform(new Point2D.Double(0, 0), null).getX();
            ytrans = tx.transform(new Point2D.Double(image.getWidth(), 0), null).getY();
        }

        AffineTransform translationTransform = new AffineTransform();
        translationTransform.translate(-xtrans, -ytrans);
        tx.preConcatenate(translationTransform);

        return new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR).filter(image, null);
    }

    public static void main(String args[]) {
        EventQueue.invokeLater(() -> new Main().setVisible(true));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btnEDInserir;
    private JButton btnFRColisao;
    private JButton btnFRProx;
    private JButton btnFRProxAE;
    private JButton btnFSEsc;
    private JButton btnFSRot;
    private JButton btnFSTrans;
    private JCheckBox chkOpc;
    private JTextField edtEDAngulo;
    private JTextField edtEDDirecao;
    private JTextField edtEDRaio;
    private JTextField edtEDVelocidade;
    private JTextField edtEDX;
    private JTextField edtEDY;
    private JTextField edtFRDM1;
    private JTextField edtFRDM2;
    private JTextField edtFRTM;
    private JTextField edtFSAng;
    private JTextField edtFSX;
    private JTextField edtFSX2;
    private JTextField edtFSX3;
    private JTextField edtFSY;
    private JTextField edtFSY2;
    private JTextField edtFSY3;
    private JTable grdData;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JLabel lblEDX;
    private JLabel lblEDX1;
    private JLabel lblEDX10;
    private JLabel lblEDX11;
    private JLabel lblEDX12;
    private JLabel lblEDX13;
    private JLabel lblEDX14;
    private JLabel lblEDX15;
    private JLabel lblEDX16;
    private JLabel lblEDX2;
    private JLabel lblEDX3;
    private JLabel lblEDX4;
    private JLabel lblEDX5;
    private JLabel lblEDX6;
    private JLabel lblEDX7;
    private JLabel lblEDX8;
    private JLabel lblEDX9;
    private JLabel lblEntradaDados;
    private JLabel lblEntradaDados1;
    private JLabel lblEntradaDados2;
    private JLabel lblEntradaDados3;
    private JLabel lblEntradaDados4;
    private JLabel lblEntradaDados5;
    private JTextArea memRelatorio;
    private JPanel pnlEntradaDados;
    private JPanel pnlFuncTrans;
    private JPanel pnlFuncTrans1;
    private JPanel pnlRadar;
    private JPanel pnlTransladar;
    private JPanel pnlTransladar1;
    private JPanel pnlTransladar2;
    private JPanel pnlTransladar3;
    private JPanel pnlTransladar4;
    // End of variables declaration//GEN-END:variables
}
