package cgra.Frame;

import javax.swing.*;
import java.util.*;

import cgra.Components.MathProcessor;
import cgra.Components.Plane;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.table.*;

public class main extends javax.swing.JFrame {
    private JLabel lblCoordinates;
    private static ArrayList<Plane> lineDataGrid;
    
    public main() {
        initComponents();

        lineDataGrid = new ArrayList<>();

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

        pack();
        setLocationRelativeTo(null);

        atualizarRadar();  
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        pnlRadar = new javax.swing.JPanel();
        pnlEntradaDados = new javax.swing.JPanel();
        lblEntradaDados = new javax.swing.JLabel();
        lblEDX = new javax.swing.JLabel();
        edtEDX = new javax.swing.JTextField();
        lblEDX1 = new javax.swing.JLabel();
        edtEDRaio = new javax.swing.JTextField();
        lblEDX2 = new javax.swing.JLabel();
        edtEDVelocidade = new javax.swing.JTextField();
        lblEDX3 = new javax.swing.JLabel();
        edtEDY = new javax.swing.JTextField();
        lblEDX4 = new javax.swing.JLabel();
        edtEDAngulo = new javax.swing.JTextField();
        lblEDX5 = new javax.swing.JLabel();
        edtEDDirecao = new javax.swing.JTextField();
        btnEDInserir = new javax.swing.JButton();
        chkOpc = new javax.swing.JCheckBox();
        pnlFuncTrans = new javax.swing.JPanel();
        lblEntradaDados1 = new javax.swing.JLabel();
        pnlTransladar = new javax.swing.JPanel();
        lblEDX6 = new javax.swing.JLabel();
        edtFSX = new javax.swing.JTextField();
        lblEDX7 = new javax.swing.JLabel();
        edtFSY = new javax.swing.JTextField();
        btnFSTrans = new javax.swing.JButton();
        pnlTransladar1 = new javax.swing.JPanel();
        lblEDX8 = new javax.swing.JLabel();
        edtFSX2 = new javax.swing.JTextField();
        lblEDX9 = new javax.swing.JLabel();
        edtFSY2 = new javax.swing.JTextField();
        btnFSEsc = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblEDX10 = new javax.swing.JLabel();
        edtFSAng = new javax.swing.JTextField();
        lblEDX11 = new javax.swing.JLabel();
        btnFSRot = new javax.swing.JButton();
        lblEDX13 = new javax.swing.JLabel();
        lblEDX12 = new javax.swing.JLabel();
        edtFSX3 = new javax.swing.JTextField();
        edtFSY3 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblEntradaDados3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdData = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        lblEntradaDados4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        memRelatorio = new javax.swing.JTextArea();
        lblEntradaDados2 = new javax.swing.JLabel();
        pnlFuncTrans1 = new javax.swing.JPanel();
        lblEntradaDados5 = new javax.swing.JLabel();
        pnlTransladar2 = new javax.swing.JPanel();
        lblEDX14 = new javax.swing.JLabel();
        edtFRDM1 = new javax.swing.JTextField();
        btnFRProxAE = new javax.swing.JButton();
        pnlTransladar3 = new javax.swing.JPanel();
        lblEDX15 = new javax.swing.JLabel();
        edtFRDM2 = new javax.swing.JTextField();
        btnFRProx = new javax.swing.JButton();
        pnlTransladar4 = new javax.swing.JPanel();
        lblEDX16 = new javax.swing.JLabel();
        edtFRTM = new javax.swing.JTextField();
        btnFRColisao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlRadar.setBackground(new java.awt.Color(204, 0, 0));
        pnlRadar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlRadar.setPreferredSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout pnlRadarLayout = new javax.swing.GroupLayout(pnlRadar);
        pnlRadar.setLayout(pnlRadarLayout);
        pnlRadarLayout.setHorizontalGroup(
            pnlRadarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        pnlRadarLayout.setVerticalGroup(
            pnlRadarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        pnlEntradaDados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblEntradaDados.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEntradaDados.setText("Entrada de Dados");

        lblEDX.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEDX.setText("X:");

        edtEDX.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblEDX1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEDX1.setText("Raio:");

        edtEDRaio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edtEDRaio.setEnabled(false);

        lblEDX2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEDX2.setText("Velocidade:");

        edtEDVelocidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblEDX3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEDX3.setText("Y:");

        edtEDY.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblEDX4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEDX4.setText("Ângulo:");

        edtEDAngulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edtEDAngulo.setEnabled(false);

        lblEDX5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEDX5.setText("Direção:");

        edtEDDirecao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnEDInserir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEDInserir.setText("Inserir");
        btnEDInserir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEDInserirMouseClicked(evt);
            }
        });

        chkOpc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chkOpc.setText("Cartesiano");
        chkOpc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chkOpc.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkOpc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkOpcItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlEntradaDadosLayout = new javax.swing.GroupLayout(pnlEntradaDados);
        pnlEntradaDados.setLayout(pnlEntradaDadosLayout);
        pnlEntradaDadosLayout.setHorizontalGroup(
            pnlEntradaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEntradaDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEntradaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEntradaDadosLayout.createSequentialGroup()
                        .addGroup(pnlEntradaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEDX1)
                            .addComponent(lblEDX2)
                            .addComponent(lblEDX, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlEntradaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlEntradaDadosLayout.createSequentialGroup()
                                .addComponent(edtEDRaio, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(lblEDX4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlEntradaDadosLayout.createSequentialGroup()
                                .addComponent(edtEDX, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblEDX3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2)
                        .addGroup(pnlEntradaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(edtEDAngulo, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(edtEDY)))
                    .addGroup(pnlEntradaDadosLayout.createSequentialGroup()
                        .addGroup(pnlEntradaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlEntradaDadosLayout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(edtEDVelocidade, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(chkOpc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEDX5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlEntradaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEDInserir, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(edtEDDirecao))))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEntradaDadosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblEntradaDados)
                .addGap(105, 105, 105))
        );
        pnlEntradaDadosLayout.setVerticalGroup(
            pnlEntradaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEntradaDadosLayout.createSequentialGroup()
                .addComponent(lblEntradaDados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEntradaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEDX)
                    .addComponent(edtEDX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEDX3)
                    .addComponent(edtEDY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEntradaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEDX1)
                    .addComponent(edtEDRaio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEDX4)
                    .addComponent(edtEDAngulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEntradaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEDX2)
                    .addComponent(edtEDVelocidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEDX5)
                    .addComponent(edtEDDirecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEntradaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEDInserir)
                    .addComponent(chkOpc))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        lblEntradaDados1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEntradaDados1.setText("Funções de Transformação");

        pnlTransladar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblEDX6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEDX6.setText("X:");

        edtFSX.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblEDX7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEDX7.setText("Y:");

        edtFSY.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnFSTrans.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFSTrans.setText("Transladar");

        javax.swing.GroupLayout pnlTransladarLayout = new javax.swing.GroupLayout(pnlTransladar);
        pnlTransladar.setLayout(pnlTransladarLayout);
        pnlTransladarLayout.setHorizontalGroup(
            pnlTransladarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTransladarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTransladarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTransladarLayout.createSequentialGroup()
                        .addComponent(lblEDX6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtFSX, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEDX7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtFSY, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addComponent(btnFSTrans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlTransladarLayout.setVerticalGroup(
            pnlTransladarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTransladarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTransladarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEDX6)
                    .addComponent(edtFSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEDX7)
                    .addComponent(edtFSY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFSTrans)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnlTransladar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblEDX8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEDX8.setText("X:");

        edtFSX2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblEDX9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEDX9.setText("Y:");

        edtFSY2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnFSEsc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFSEsc.setText("Escalonar");

        javax.swing.GroupLayout pnlTransladar1Layout = new javax.swing.GroupLayout(pnlTransladar1);
        pnlTransladar1.setLayout(pnlTransladar1Layout);
        pnlTransladar1Layout.setHorizontalGroup(
            pnlTransladar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTransladar1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTransladar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTransladar1Layout.createSequentialGroup()
                        .addComponent(btnFSEsc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pnlTransladar1Layout.createSequentialGroup()
                        .addComponent(lblEDX8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtFSX2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEDX9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtFSY2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 20, Short.MAX_VALUE))))
        );
        pnlTransladar1Layout.setVerticalGroup(
            pnlTransladar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTransladar1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTransladar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEDX8)
                    .addComponent(edtFSX2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEDX9)
                    .addComponent(edtFSY2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFSEsc)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblEDX10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEDX10.setText("Ângulo:");

        edtFSAng.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblEDX11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEDX11.setText("Centro de Rotação");

        btnFSRot.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFSRot.setText("Rotacionar");

        lblEDX13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEDX13.setText("Y:");

        lblEDX12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEDX12.setText("X:");

        edtFSX3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        edtFSY3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblEDX10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtFSAng)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblEDX11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnFSRot, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblEDX12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtFSX3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEDX13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtFSY3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEDX10)
                    .addComponent(edtFSAng)
                    .addComponent(lblEDX11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFSRot, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEDX12)
                        .addComponent(edtFSX3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblEDX13)
                        .addComponent(edtFSY3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlFuncTransLayout = new javax.swing.GroupLayout(pnlFuncTrans);
        pnlFuncTrans.setLayout(pnlFuncTransLayout);
        pnlFuncTransLayout.setHorizontalGroup(
            pnlFuncTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFuncTransLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblEntradaDados1)
                .addGap(71, 71, 71))
            .addGroup(pnlFuncTransLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFuncTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlFuncTransLayout.createSequentialGroup()
                        .addComponent(pnlTransladar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlTransladar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlFuncTransLayout.setVerticalGroup(
            pnlFuncTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFuncTransLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEntradaDados1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFuncTransLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlTransladar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTransladar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        lblEntradaDados3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEntradaDados3.setText("Data Grid");

        grdData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "X", "Y", "R", "A", "V", "D"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        grdData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                grdDataMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(grdData);

        lblEntradaDados4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEntradaDados4.setText("Relatório");
        lblEntradaDados4.setToolTipText("");

        memRelatorio.setEditable(false);
        memRelatorio.setColumns(20);
        memRelatorio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        memRelatorio.setRows(5);
        jScrollPane2.setViewportView(memRelatorio);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lblEntradaDados4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(lblEntradaDados3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblEntradaDados3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblEntradaDados2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEntradaDados2.setText("Radar");

        lblEntradaDados5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEntradaDados5.setText("Funções de Rastreamento");

        pnlTransladar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblEDX14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEDX14.setText("Distância Mínima:");

        edtFRDM1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnFRProxAE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFRProxAE.setText("Aviões Próximos ao Aeroporto");

        javax.swing.GroupLayout pnlTransladar2Layout = new javax.swing.GroupLayout(pnlTransladar2);
        pnlTransladar2.setLayout(pnlTransladar2Layout);
        pnlTransladar2Layout.setHorizontalGroup(
            pnlTransladar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTransladar2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblEDX14, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtFRDM1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(pnlTransladar2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFRProxAE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTransladar2Layout.setVerticalGroup(
            pnlTransladar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTransladar2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTransladar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtFRDM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEDX14))
                .addGap(18, 18, 18)
                .addComponent(btnFRProxAE, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pnlTransladar3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblEDX15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEDX15.setText("Distância Mínima:");

        edtFRDM2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnFRProx.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFRProx.setText("Aviões Próximos");

        javax.swing.GroupLayout pnlTransladar3Layout = new javax.swing.GroupLayout(pnlTransladar3);
        pnlTransladar3.setLayout(pnlTransladar3Layout);
        pnlTransladar3Layout.setHorizontalGroup(
            pnlTransladar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTransladar3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblEDX15, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtFRDM2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(pnlTransladar3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFRProx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTransladar3Layout.setVerticalGroup(
            pnlTransladar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTransladar3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTransladar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtFRDM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEDX15))
                .addGap(18, 18, 18)
                .addComponent(btnFRProx, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pnlTransladar4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblEDX16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEDX16.setText("Tempo Mínimo (seg):");

        edtFRTM.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnFRColisao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFRColisao.setText("Em Rota de Colisão");
        btnFRColisao.setActionCommand("");

        javax.swing.GroupLayout pnlTransladar4Layout = new javax.swing.GroupLayout(pnlTransladar4);
        pnlTransladar4.setLayout(pnlTransladar4Layout);
        pnlTransladar4Layout.setHorizontalGroup(
            pnlTransladar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTransladar4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblEDX16, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(edtFRTM, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlTransladar4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFRColisao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTransladar4Layout.setVerticalGroup(
            pnlTransladar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTransladar4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTransladar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtFRTM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEDX16))
                .addGap(18, 18, 18)
                .addComponent(btnFRColisao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlFuncTrans1Layout = new javax.swing.GroupLayout(pnlFuncTrans1);
        pnlFuncTrans1.setLayout(pnlFuncTrans1Layout);
        pnlFuncTrans1Layout.setHorizontalGroup(
            pnlFuncTrans1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFuncTrans1Layout.createSequentialGroup()
                .addGroup(pnlFuncTrans1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFuncTrans1Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(lblEntradaDados5))
                    .addGroup(pnlFuncTrans1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlTransladar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlFuncTrans1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlTransladar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlTransladar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFuncTrans1Layout.setVerticalGroup(
            pnlFuncTrans1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFuncTrans1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEntradaDados5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFuncTrans1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTransladar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlTransladar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlTransladar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlEntradaDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlFuncTrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(185, 185, 185)
                                .addComponent(lblEntradaDados2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE))
                            .addComponent(pnlRadar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pnlFuncTrans1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlEntradaDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pnlFuncTrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEntradaDados2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlRadar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlFuncTrans1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }//GEN-END:initComponents

    private void btnEDInserirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEDInserirMouseClicked
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
                newPlane = MathProcessor.convertCartesianToPolar(newPlane);
            } else {
                newPlane.setRadius(liRadius);
                newPlane.setAngle(liAngle);
                newPlane = MathProcessor.convertPolarToCartesian(newPlane);
            }

            newPlane.setCode(generateCode());
            lineDataGrid.add(newPlane);

            DefaultTableModel model = (DefaultTableModel) grdData.getModel();
            model.addRow(new Object[] {
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

    private void chkOpcItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkOpcItemStateChanged
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

    private void grdDataMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grdDataMousePressed
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
    
        double xtrans = 0, ytrans = 0;
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEDInserir;
    private javax.swing.JButton btnFRColisao;
    private javax.swing.JButton btnFRProx;
    private javax.swing.JButton btnFRProxAE;
    private javax.swing.JButton btnFSEsc;
    private javax.swing.JButton btnFSRot;
    private javax.swing.JButton btnFSTrans;
    private javax.swing.JCheckBox chkOpc;
    private javax.swing.JTextField edtEDAngulo;
    private javax.swing.JTextField edtEDDirecao;
    private javax.swing.JTextField edtEDRaio;
    private javax.swing.JTextField edtEDVelocidade;
    private javax.swing.JTextField edtEDX;
    private javax.swing.JTextField edtEDY;
    private javax.swing.JTextField edtFRDM1;
    private javax.swing.JTextField edtFRDM2;
    private javax.swing.JTextField edtFRTM;
    private javax.swing.JTextField edtFSAng;
    private javax.swing.JTextField edtFSX;
    private javax.swing.JTextField edtFSX2;
    private javax.swing.JTextField edtFSX3;
    private javax.swing.JTextField edtFSY;
    private javax.swing.JTextField edtFSY2;
    private javax.swing.JTextField edtFSY3;
    private javax.swing.JTable grdData;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEDX;
    private javax.swing.JLabel lblEDX1;
    private javax.swing.JLabel lblEDX10;
    private javax.swing.JLabel lblEDX11;
    private javax.swing.JLabel lblEDX12;
    private javax.swing.JLabel lblEDX13;
    private javax.swing.JLabel lblEDX14;
    private javax.swing.JLabel lblEDX15;
    private javax.swing.JLabel lblEDX16;
    private javax.swing.JLabel lblEDX2;
    private javax.swing.JLabel lblEDX3;
    private javax.swing.JLabel lblEDX4;
    private javax.swing.JLabel lblEDX5;
    private javax.swing.JLabel lblEDX6;
    private javax.swing.JLabel lblEDX7;
    private javax.swing.JLabel lblEDX8;
    private javax.swing.JLabel lblEDX9;
    private javax.swing.JLabel lblEntradaDados;
    private javax.swing.JLabel lblEntradaDados1;
    private javax.swing.JLabel lblEntradaDados2;
    private javax.swing.JLabel lblEntradaDados3;
    private javax.swing.JLabel lblEntradaDados4;
    private javax.swing.JLabel lblEntradaDados5;
    private javax.swing.JTextArea memRelatorio;
    private javax.swing.JPanel pnlEntradaDados;
    private javax.swing.JPanel pnlFuncTrans;
    private javax.swing.JPanel pnlFuncTrans1;
    private javax.swing.JPanel pnlRadar;
    private javax.swing.JPanel pnlTransladar;
    private javax.swing.JPanel pnlTransladar1;
    private javax.swing.JPanel pnlTransladar2;
    private javax.swing.JPanel pnlTransladar3;
    private javax.swing.JPanel pnlTransladar4;
    // End of variables declaration//GEN-END:variables
}
