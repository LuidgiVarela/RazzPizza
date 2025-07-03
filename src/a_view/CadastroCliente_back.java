package a_view;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author luidgivarela
 */
import b_model.BancoUsuarios;
import b_model.Cliente;
import java.awt.Color;
import java.awt.Font;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;


public class CadastroCliente_back extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CadastroCliente_back.class.getName());

    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente_back() {
        initComponents();
        setSize(900, 800);
        setLocationRelativeTo(null);    // centraliza na tela
        
        // para o número
        try {
            MaskFormatter telefoneFormatter = new MaskFormatter("(##) #####-####");
            telefoneFormatter.setPlaceholderCharacter('_');
            campoTelefone1.setFormatterFactory(
            new javax.swing.text.DefaultFormatterFactory(telefoneFormatter)
        );
        campoTelefone1.setFont(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 18));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }

        // para o CPF
        try {
            MaskFormatter maskCPF = new MaskFormatter("###.###.###-##");
            maskCPF.setPlaceholderCharacter('_'); // Usa underline como caractere de preenchimento

            campoCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(maskCPF));
            campoCPF.setFont(new java.awt.Font("SansSerif", java.awt.Font.BOLD, 14));
            campoCPF.setBackground(new java.awt.Color(240, 240, 240));
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
        
        // para o CEP
        try {
            MaskFormatter maskCEP = new MaskFormatter("#####-###");
            maskCEP.setPlaceholderCharacter('_'); // Define o underline como caractere de preenchimento

            campoCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(maskCEP));
            campoCEP.setFont(new java.awt.Font("SansSerif", java.awt.Font.BOLD, 14));
            campoCEP.setBackground(new java.awt.Color(240, 240, 240));
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
        
        campoNome.setText("Fulano da Silva");
        campoNome.setForeground(Color.GRAY);
        campoNome.setFont(new Font("SansSerif", Font.ITALIC, 12));
        campoNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (campoNome.getText().equals("Fulano da Silva")) {
                    campoNome.setText("");
                    campoNome.setForeground(Color.BLACK);
                    campoNome.setFont(new Font("SansSerif", Font.PLAIN, 12));
                }
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (campoNome.getText().isEmpty()) {
                    campoNome.setText("Fulano da Silva");
                    campoNome.setForeground(Color.GRAY);
                    campoNome.setFont(new Font("SansSerif", Font.ITALIC, 12));
                }
            }
        });

        campoTelefone1.setText("(99)99999-9999");
        campoTelefone.setForeground(Color.GRAY);
        campoTelefone.setFont(new Font("SansSerif", Font.ITALIC, 12));
        campoTelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (campoTelefone1.getText().equals("(99)99999-9999")) {
                    campoTelefone1.setText("");
                    campoTelefone.setForeground(Color.BLACK);
                    campoTelefone.setFont(new Font("SansSerif", Font.PLAIN, 12));
                }
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (campoTelefone1.getText().isEmpty()) {
                    campoTelefone1.setText("(99)99999-9999");
                    campoTelefone.setForeground(Color.GRAY);
                    campoTelefone.setFont(new Font("SansSerif", Font.ITALIC, 12));
                }
            }
        });

        campoEmail.setText("exemplo@gmail.com");
        campoEmail.setForeground(Color.GRAY);
        campoEmail.setFont(new Font("SansSerif", Font.ITALIC, 12));
        campoEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (campoEmail.getText().equals("exemplo@gmail.com")) {
                    campoEmail.setText("");
                    campoEmail.setForeground(Color.BLACK);
                    campoEmail.setFont(new Font("SansSerif", Font.PLAIN, 12));
                }
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (campoEmail.getText().isEmpty()) {
                    campoEmail.setText("exemplo@gmail.com");
                    campoEmail.setForeground(Color.GRAY);
                    campoEmail.setFont(new Font("SansSerif", Font.ITALIC, 12));
                }
            }
        });

        campoCPF.setText("000.000.000-00");
        campoCPF.setForeground(Color.GRAY);
        campoCPF.setFont(new Font("SansSerif", Font.ITALIC, 12));
        campoCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (campoCPF.getText().equals("000.000.000-00")) {
                    campoCPF.setText("");
                    campoCPF.setForeground(Color.BLACK);
                    campoCPF.setFont(new Font("SansSerif", Font.PLAIN, 12));
                }
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (campoCPF.getText().isEmpty()) {
                    campoCPF.setText("000.000.000-00");
                    campoCPF.setForeground(Color.GRAY);
                    campoCPF.setFont(new Font("SansSerif", Font.ITALIC, 12));
                }
            }
        });

        campoCEP.setText("00000-000");
        campoCEP.setForeground(Color.GRAY);
        campoCEP.setFont(new Font("SansSerif", Font.ITALIC, 12));
        campoCEP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (campoCEP.getText().equals("00000-000")) {
                    campoCEP.setText("");
                    campoCEP.setForeground(Color.BLACK);
                    campoCEP.setFont(new Font("SansSerif", Font.PLAIN, 12));
                }
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (campoCEP.getText().isEmpty()) {
                    campoCEP.setText("00000-000");
                    campoCEP.setForeground(Color.GRAY);
                    campoCEP.setFont(new Font("SansSerif", Font.ITALIC, 12));
                }
            }
        });

        campoNumResidencia.setText("123");
        campoNumResidencia.setForeground(Color.GRAY);
        campoNumResidencia.setFont(new Font("SansSerif", Font.ITALIC, 12));
        campoNumResidencia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (campoNumResidencia.getText().equals("123")) {
                    campoNumResidencia.setText("");
                    campoNumResidencia.setForeground(Color.BLACK);
                    campoNumResidencia.setFont(new Font("SansSerif", Font.PLAIN, 12));
                }
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (campoNumResidencia.getText().isEmpty()) {
                    campoNumResidencia.setText("123");
                    campoNumResidencia.setForeground(Color.GRAY);
                    campoNumResidencia.setFont(new Font("SansSerif", Font.ITALIC, 12));
                }
            }
        });        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        campoTelefone = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        campoNumResidencia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        campoSenha = new javax.swing.JPasswordField();
        campoConfirmaSenha = new javax.swing.JPasswordField();
        campoTelefone1 = new javax.swing.JFormattedTextField();
        campoCPF = new javax.swing.JFormattedTextField();
        campoCEP = new javax.swing.JFormattedTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();

        jButton2.setText("Início");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 193, 7));
        jButton4.setText("👋 Sair");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        campoTelefone.setBackground(new java.awt.Color(123, 63, 0));
        campoTelefone.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(255, 193, 7));
        jButton1.setText("🍕 Início");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 193, 7));
        jButton3.setText("👋 Sair");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout campoTelefoneLayout = new javax.swing.GroupLayout(campoTelefone);
        campoTelefone.setLayout(campoTelefoneLayout);
        campoTelefoneLayout.setHorizontalGroup(
            campoTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(campoTelefoneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        campoTelefoneLayout.setVerticalGroup(
            campoTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(campoTelefoneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(campoTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("👤 Digite seu nome:");

        campoNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(123, 63, 0), 3));
        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("📞 Digite seu telefone:");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel4.setText("📧 Digite seu email:");

        campoEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(123, 63, 0), 3));
        campoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmailActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel5.setText("🪪 Digite seu CPF:");

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel7.setText("📮 Informe seu CEP:");

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel8.setText("🏠 Número de sua residência:");

        campoNumResidencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(123, 63, 0), 3));

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel9.setText("🔐 Crie a sua senha: ");

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel10.setText("✅ Confirme a sua senha: ");

        jButton5.setBackground(new java.awt.Color(255, 193, 7));
        jButton5.setText("🟢Finalizar cadastro");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        campoSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(123, 63, 0), 3));
        campoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSenhaActionPerformed(evt);
            }
        });

        campoConfirmaSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(123, 63, 0), 3));

        campoTelefone1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(123, 63, 0), 3));
        campoTelefone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTelefone1ActionPerformed(evt);
            }
        });

        campoCPF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(123, 63, 0), 3));

        campoCEP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(123, 63, 0), 3));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabel4)
                        .addGap(35, 35, 35)
                        .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabel8)
                        .addGap(12, 12, 12)
                        .addComponent(campoNumResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabel9)
                        .addGap(39, 39, 39)
                        .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabel10)
                        .addGap(6, 6, 6)
                        .addComponent(campoConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(825, 825, 825)
                        .addComponent(jButton5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(campoTelefone1))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(33, 33, 33)
                                .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoCPF)
                            .addComponent(campoCEP, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2))
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4))
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel8))
                    .addComponent(campoNumResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel9))
                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel10))
                    .addComponent(campoConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jButton5))
        );

        jPanel5.setBackground(new java.awt.Color(255, 248, 220));

        jLabel1.setFont(new java.awt.Font("Herculanum", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Faça o seu Cadastro!");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(406, 406, 406)
                .addComponent(jLabel1))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1))
        );

        jPanel4.setBackground(new java.awt.Color(255, 248, 220));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(campoTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LoginCliente_back telaLogin = new LoginCliente_back();
        telaLogin.setVisible(true);
        this.dispose(); // Fecha a tela atual
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    // 1. Dados preenchidos nos campos de texto
    String nome = campoNome.getText();
    String email = campoEmail.getText();
    String telefone = campoTelefone1.getText();
    String cep = campoCEP.getText();
    String numero = campoNumResidencia.getText();
    String senha = campoSenha.getText();

    // 2. Criando o objeto Cliente
    Cliente cliente = new Cliente(nome, email, telefone, cep, senha, numero);

    // 3. Salvando no "banco"
    BancoUsuarios.listaUsuarios.add(cliente);

    // 4. Abrindo a tela de perfil
    LoginCliente_back telaLogin = new LoginCliente_back();
    telaLogin.setVisible(true);
    this.dispose(); // Fecha a tela de cadastro
    }//GEN-LAST:event_jButton5ActionPerformed

    private void campoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEmailActionPerformed

    private void campoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSenhaActionPerformed

    private void campoTelefone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTelefone1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTelefone1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new CadastroCliente_back().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField campoCEP;
    private javax.swing.JFormattedTextField campoCPF;
    private javax.swing.JPasswordField campoConfirmaSenha;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoNumResidencia;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JPanel campoTelefone;
    private javax.swing.JFormattedTextField campoTelefone1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
