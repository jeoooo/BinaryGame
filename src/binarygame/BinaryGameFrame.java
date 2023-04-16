package binarygame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random; // used for generating random numbers
import javax.swing.JLabel;
import javax.swing.Timer; // for the timer
public class BinaryGameFrame extends javax.swing.JFrame {

    public BinaryGameFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jButton128 = new javax.swing.JButton();
        jLabel128 = new javax.swing.JLabel();
        jButton64 = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        jButton32 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonStart = new javax.swing.JButton();
        jLabelDecimal = new javax.swing.JLabel();
        jLabelRand = new javax.swing.JLabel();
        jButtonCheck = new javax.swing.JButton();
        jLabelCheck = new javax.swing.JLabel();
        jLabelCheckBox = new javax.swing.JLabel();
        jLabelScore = new javax.swing.JLabel();
        jLabelScoreNum = new javax.swing.JLabel();
        jLabelRoundNumber = new javax.swing.JLabel();
        jLabelMistakes = new javax.swing.JLabel();
        jLabelRound = new javax.swing.JLabel();
        jLabelLevel = new javax.swing.JLabel();
        jLabelGameLevel = new javax.swing.JLabel();
        jLabelDecimalLabel = new javax.swing.JLabel();
        jLabelTime = new javax.swing.JLabel();
        jLabelTimerCount = new javax.swing.JLabel();
        jLabelRound1 = new javax.swing.JLabel();
        jLabelMist = new javax.swing.JLabel();
        jLabelBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Binary Game");
        setMinimumSize(new java.awt.Dimension(716, 620));
        setResizable(false);
        setSize(new java.awt.Dimension(716, 620));
        getContentPane().setLayout(null);

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(51, 255, 0));
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("BINARY GAME");
        getContentPane().add(jLabelTitle);
        jLabelTitle.setBounds(12, 0, 697, 79);

        jButton128.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton128.setText("128");
        jButton128.setAutoscrolls(true);
        jButton128.setMaximumSize(new java.awt.Dimension(80, 40));
        jButton128.setMinimumSize(new java.awt.Dimension(80, 40));
        jButton128.setPreferredSize(new java.awt.Dimension(80, 40));
        jButton128.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton128ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton128);
        jButton128.setBounds(12, 97, 80, 40);

        jLabel128.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel128.setForeground(new java.awt.Color(51, 255, 0));
        jLabel128.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel128.setText("0");
        getContentPane().add(jLabel128);
        jLabel128.setBounds(12, 141, 77, 80);

        jButton64.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton64.setText("64");
        jButton64.setMaximumSize(new java.awt.Dimension(80, 40));
        jButton64.setMinimumSize(new java.awt.Dimension(80, 40));
        jButton64.setPreferredSize(new java.awt.Dimension(80, 40));
        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton64);
        jButton64.setBounds(96, 97, 80, 40);

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(51, 255, 0));
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("0");
        getContentPane().add(jLabel64);
        jLabel64.setBounds(96, 141, 77, 80);

        jButton32.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton32.setText("32");
        jButton32.setMaximumSize(new java.awt.Dimension(80, 40));
        jButton32.setMinimumSize(new java.awt.Dimension(80, 40));
        jButton32.setPreferredSize(new java.awt.Dimension(80, 40));
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton32);
        jButton32.setBounds(180, 97, 80, 40);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(51, 255, 0));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("0");
        getContentPane().add(jLabel32);
        jLabel32.setBounds(180, 141, 77, 80);

        jButton16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton16.setText("16");
        jButton16.setMaximumSize(new java.awt.Dimension(80, 40));
        jButton16.setMinimumSize(new java.awt.Dimension(80, 40));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16);
        jButton16.setBounds(264, 97, 80, 40);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 255, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("0");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(264, 141, 77, 80);

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton8.setText("8");
        jButton8.setMaximumSize(new java.awt.Dimension(80, 40));
        jButton8.setMinimumSize(new java.awt.Dimension(80, 40));
        jButton8.setPreferredSize(new java.awt.Dimension(80, 40));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(348, 97, 80, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 255, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("0");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(348, 141, 77, 80);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.setText("4");
        jButton4.setMaximumSize(new java.awt.Dimension(80, 40));
        jButton4.setMinimumSize(new java.awt.Dimension(80, 40));
        jButton4.setPreferredSize(new java.awt.Dimension(80, 40));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(432, 97, 80, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("0");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(432, 141, 77, 80);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("2");
        jButton2.setMaximumSize(new java.awt.Dimension(80, 40));
        jButton2.setMinimumSize(new java.awt.Dimension(80, 40));
        jButton2.setPreferredSize(new java.awt.Dimension(80, 40));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(516, 97, 80, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("0");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(516, 141, 77, 80);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("1");
        jButton1.setMaximumSize(new java.awt.Dimension(80, 40));
        jButton1.setMinimumSize(new java.awt.Dimension(80, 40));
        jButton1.setPreferredSize(new java.awt.Dimension(80, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(600, 97, 80, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("0");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(600, 141, 77, 80);

        jButtonStart.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonStart.setText("Start");
        jButtonStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStartActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonStart);
        jButtonStart.setBounds(3, 239, 191, 37);

        jLabelDecimal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelDecimal.setForeground(new java.awt.Color(51, 255, 0));
        jLabelDecimal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelDecimal.setText("Value:");
        getContentPane().add(jLabelDecimal);
        jLabelDecimal.setBounds(0, 382, 78, 29);

        jLabelRand.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelRand.setForeground(new java.awt.Color(51, 255, 0));
        jLabelRand.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelRand.setText("0");
        getContentPane().add(jLabelRand);
        jLabelRand.setBounds(115, 346, 79, 29);

        jButtonCheck.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonCheck.setText("Check");
        jButtonCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCheck);
        jButtonCheck.setBounds(3, 283, 191, 37);

        jLabelCheck.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelCheck.setForeground(new java.awt.Color(51, 255, 0));
        jLabelCheck.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelCheck.setText("0");
        getContentPane().add(jLabelCheck);
        jLabelCheck.setBounds(96, 382, 98, 29);

        jLabelCheckBox.setBackground(new java.awt.Color(51, 255, 0));
        jLabelCheckBox.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jLabelCheckBox.setForeground(new java.awt.Color(51, 255, 0));
        jLabelCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCheckBox.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabelCheckBox);
        jLabelCheckBox.setBounds(212, 239, 490, 333);

        jLabelScore.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelScore.setForeground(new java.awt.Color(51, 255, 0));
        jLabelScore.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelScore.setText("Score:");
        getContentPane().add(jLabelScore);
        jLabelScore.setBounds(3, 418, 78, 29);

        jLabelScoreNum.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelScoreNum.setForeground(new java.awt.Color(51, 255, 0));
        jLabelScoreNum.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelScoreNum.setText("0");
        getContentPane().add(jLabelScoreNum);
        jLabelScoreNum.setBounds(99, 418, 95, 29);

        jLabelRoundNumber.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelRoundNumber.setForeground(new java.awt.Color(51, 255, 0));
        jLabelRoundNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelRoundNumber.setText("0");
        getContentPane().add(jLabelRoundNumber);
        jLabelRoundNumber.setBounds(96, 490, 98, 29);

        jLabelMistakes.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabelMistakes.setForeground(new java.awt.Color(0, 255, 0));
        jLabelMistakes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelMistakes.setText("0");
        getContentPane().add(jLabelMistakes);
        jLabelMistakes.setBounds(680, 570, 20, 30);

        jLabelRound.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelRound.setForeground(new java.awt.Color(51, 255, 0));
        jLabelRound.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelRound.setText("Round:");
        getContentPane().add(jLabelRound);
        jLabelRound.setBounds(3, 490, 86, 29);

        jLabelLevel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelLevel.setForeground(new java.awt.Color(51, 255, 0));
        jLabelLevel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelLevel.setText("Level:");
        getContentPane().add(jLabelLevel);
        jLabelLevel.setBounds(3, 454, 72, 29);

        jLabelGameLevel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelGameLevel.setForeground(new java.awt.Color(51, 255, 0));
        jLabelGameLevel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelGameLevel.setText("-");
        getContentPane().add(jLabelGameLevel);
        jLabelGameLevel.setBounds(96, 454, 98, 29);

        jLabelDecimalLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelDecimalLabel.setForeground(new java.awt.Color(51, 255, 0));
        jLabelDecimalLabel.setText("Decimal:");
        getContentPane().add(jLabelDecimalLabel);
        jLabelDecimalLabel.setBounds(3, 346, 105, 29);

        jLabelTime.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelTime.setForeground(new java.awt.Color(51, 255, 0));
        jLabelTime.setText("Time:");
        getContentPane().add(jLabelTime);
        jLabelTime.setBounds(3, 520, 100, 30);

        jLabelTimerCount.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelTimerCount.setForeground(new java.awt.Color(0, 255, 0));
        jLabelTimerCount.setText("20");
        getContentPane().add(jLabelTimerCount);
        jLabelTimerCount.setBounds(180, 520, 40, 40);

        jLabelRound1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelRound1.setForeground(new java.awt.Color(51, 255, 0));
        jLabelRound1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelRound1.setText("Round:");
        getContentPane().add(jLabelRound1);
        jLabelRound1.setBounds(3, 490, 86, 29);

        jLabelMist.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabelMist.setForeground(new java.awt.Color(51, 255, 0));
        jLabelMist.setText("Mistakes:");
        getContentPane().add(jLabelMist);
        jLabelMist.setBounds(650, 580, 50, 10);

        jLabelBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/binarygame/hexagonal-shape-technology-background_31543-348.jpg"))); // NOI18N
        jLabelBG.setText("BG");
        jLabelBG.setMaximumSize(new java.awt.Dimension(710, 600));
        jLabelBG.setMinimumSize(new java.awt.Dimension(710, 600));
        jLabelBG.setPreferredSize(new java.awt.Dimension(710, 600));
        getContentPane().add(jLabelBG);
        jLabelBG.setBounds(0, 0, 710, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents
   // JButtons from 1-128 sets their respective JLabels to 1 or 0 if pressed
    private void jButton128ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton128ActionPerformed
    String s;
    if ("0".equals(jLabel128.getText())){
        s = "1";
        jLabel128.setText(s);
        }
    else
        s = "0";
        jLabel128.setText(s);
    }//GEN-LAST:event_jButton128ActionPerformed

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton64ActionPerformed
    String s;
    if ("0".equals(jLabel64.getText())){
        s = "1";
        jLabel64.setText(s);
        }
    else
        s = "0";
        jLabel64.setText(s);
    }//GEN-LAST:event_jButton64ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
    String s;
    if ("0".equals(jLabel32.getText())){
        s = "1";
        jLabel32.setText(s);
        }
    else
        s = "0";
        jLabel32.setText(s);
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
    String s;
    if ("0".equals(jLabel16.getText())){
        s = "1";
        jLabel16.setText(s);
        }
    else
        s = "0";
        jLabel16.setText(s);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    String s;
    if ("0".equals(jLabel8.getText())){
        s = "1";
        jLabel8.setText(s);
        }
    else
        s = "0";
        jLabel8.setText(s);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    String s;
    if ("0".equals(jLabel4.getText())){
        s = "1";
        jLabel4.setText(s);
        }
    else
        s = "0";
        jLabel4.setText(s);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    String s;
    if ("0".equals(jLabel2.getText())){
        s = "1";
        jLabel2.setText(s);
        }
    else
        s = "0";
        jLabel2.setText(s);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String s;
    if ("0".equals(jLabel1.getText())){
        s = "1";
        jLabel1.setText(s);
        }
    else
        s = "0";
        jLabel1.setText(s);
    }//GEN-LAST:event_jButton1ActionPerformed
    
// creates a 20 second timer using instantiation + ActionListener 
// A timer is ccreated by importing "import java.util.Timer;", or "import javax.swing.Timer;" in this case.
int timer = 20; // sets timer to 20 seconds
Timer time = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            jLabelTimerCount.setText(String.valueOf(timer));
            timer--; // for every 1000 milliseconds, timer decrements
            
            if (jLabelTimerCount.getText().equals(String.valueOf(0))) {
                jButtonCheckActionPerformed(e);
                time.stop();  
            }
        }
    });
    
    
    private void jButtonStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStartActionPerformed
    jButtonStart.setText("Continue");
    
    
    time.start(); // starts the timer
    // timer
        
        // generates random numbers based on the set difficulty ---- easy, medium, and hard respectively
       Random rand = new Random();
        int GameNumber = Integer.parseInt(jLabelRoundNumber.getText()), random = 0;
        GameNumber++;
        jLabelRoundNumber.setText(Integer.toString(GameNumber));
        
        if(GameNumber < 6){
            int upperbound = 14;
            int int_random = 1 + rand.nextInt(upperbound);
            jLabelCheckBox.setText(Integer.toString(int_random));
            jLabelRand.setText(Integer.toString(int_random));
            jLabelGameLevel.setText("Easy");
        }
        else if(GameNumber > 5 && GameNumber < 11){
            do{
                int upperbound = 62;
                int int_random = 1 + rand.nextInt(upperbound);
                random = int_random;
            }while(random < 14);
            jLabelCheckBox.setText(Integer.toString(random));
            jLabelRand.setText(Integer.toString(random));
            jLabelGameLevel.setText("Medium");
        }
        else if(GameNumber > 10 && GameNumber < 16){
            do{
                int upperbound = 254;
                int int_random = 1 + rand.nextInt(upperbound);
                random = int_random;
            }while(random < 62);
            jLabelCheckBox.setText(Integer.toString(random));
            jLabelRand.setText(Integer.toString(random));
            jLabelGameLevel.setText("Hard");
        }
        else if(GameNumber == 16){
            jLabelRand.setText("0");
            jLabelRoundNumber.setText("15");
        }
        
        jLabelCheck.setText("0");
        jLabel1.setText("0");
        jLabel2.setText("0");
        jLabel4.setText("0");
        jLabel8.setText("0");
        jLabel16.setText("0");
        jLabel32.setText("0");
        jLabel64.setText("0");
        jLabel128.setText("0");
        
        
        
    }//GEN-LAST:event_jButtonStartActionPerformed
    
    private void jButtonCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCheckActionPerformed
       
       
       
        
        
        // check button code checks if the sum of the values total the expected randomly generated number
        jLabelCheckBox.setText("");
        int b1=0, b2=0, b3=0, b4=0, b5=0, b6=0, b7=0, b8=0, total;
        int score = Integer.parseInt(jLabelScoreNum.getText());
        int mistakes = Integer.parseInt(jLabelMistakes.getText());
        if ("1".equals(jLabel128.getText()))
            b1 = 128;
        if ("1".equals(jLabel64.getText()))
            b2 = 64;
        if ("1".equals(jLabel32.getText()))
            b3 = 32;
        if ("1".equals(jLabel16.getText()))
            b4 = 16;
        if ("1".equals(jLabel8.getText()))
            b5 = 8;
        if ("1".equals(jLabel4.getText()))
            b6 = 4;
        if ("1".equals(jLabel2.getText()))
            b7 = 2;
        if ("1".equals(jLabel1.getText()))
            b8 = 1;
        
        total = b1 + b2 + b3 + b4 + b5 + b6 + b7 + b8;
        
        //displays correct if answer is "correct", otherwise, it displays "wrong"
        jLabelCheck.setText(Integer.toString(total));
        String t = Integer.toString(total); 
        if(t.equals(jLabelRand.getText())){
            score++;
            jLabelCheckBox.setText("Correct");
            jLabelScoreNum.setText(Integer.toString(score)); 
            
            timer = 20;
            jLabelTimerCount.setText(String.valueOf(timer));
            time.start();
        }
        else{
            mistakes++;
            jLabelCheckBox.setText("Wrong");
            jLabelMistakes.setText(Integer.toString(mistakes));
            
            timer = 20;
            jLabelTimerCount.setText(String.valueOf(timer));
            time.start();
        }
        
        jLabel1.setText("0");
        jLabel2.setText("0");
        jLabel4.setText("0");
        jLabel8.setText("0");
        jLabel16.setText("0");
        jLabel32.setText("0");
        jLabel64.setText("0");
        jLabel128.setText("0");
        
        // displays number of mistakes commited (see lower right corner of the screen)
        if((score+mistakes)==15){
            jLabelCheckBox.setText("Score: "+Integer.toString(score));
            jLabelRand.setText("0");
            jLabelCheckBox.setText("Score: " + Integer.parseInt(jLabelScoreNum.getText()));
            jLabelRoundNumber.setText("15");
        }
        
    }//GEN-LAST:event_jButtonCheckActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BinaryGameFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton128;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButtonCheck;
    private javax.swing.JButton jButtonStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelBG;
    private javax.swing.JLabel jLabelCheck;
    private javax.swing.JLabel jLabelCheckBox;
    private javax.swing.JLabel jLabelDecimal;
    private javax.swing.JLabel jLabelDecimalLabel;
    private javax.swing.JLabel jLabelGameLevel;
    private javax.swing.JLabel jLabelLevel;
    private javax.swing.JLabel jLabelMist;
    private javax.swing.JLabel jLabelMistakes;
    private javax.swing.JLabel jLabelRand;
    private javax.swing.JLabel jLabelRound;
    private javax.swing.JLabel jLabelRound1;
    private javax.swing.JLabel jLabelRoundNumber;
    private javax.swing.JLabel jLabelScore;
    private javax.swing.JLabel jLabelScoreNum;
    private javax.swing.JLabel jLabelTime;
    private javax.swing.JLabel jLabelTimerCount;
    private javax.swing.JLabel jLabelTitle;
    // End of variables declaration//GEN-END:variables
}