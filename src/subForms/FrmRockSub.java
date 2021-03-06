
import static cpt.CPT.playMusic;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 073630006
 */
public class FrmRockSub extends javax.swing.JFrame {

    //Declare and initialize variables
    String artist = FrmRockForm.rockSub;
    String musicFile;
    int sub;
    
    
    /**
     * Creates new form FrmRockSub
     */
    public FrmRockSub() {
        initComponents();
    }

    //Method to carry String variable value to JLabel
    public FrmRockSub(String para){
        initComponents();
        
        lblMainArtistName.setText(para);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblSimilarName = new javax.swing.JLabel();
        lblMainArtistName = new javax.swing.JLabel();
        lblSimilarCode = new javax.swing.JLabel();
        btnPlaySong = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnBackToMenu = new javax.swing.JButton();
        btnBackToGenres = new javax.swing.JButton();
        btnBackToRock = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblDidYouLike = new javax.swing.JLabel();
        btnLikeYes = new javax.swing.JButton();
        btnNoLike = new javax.swing.JButton();
        lblPromptNextFrm = new javax.swing.JLabel();
        btnGenerateNew = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(26, 24, 24));

        lblSimilarName.setFont(new java.awt.Font("Segoe UI", 1, 55)); // NOI18N
        lblSimilarName.setForeground(new java.awt.Color(255, 255, 255));
        lblSimilarName.setText("SUB ARTIST");

        lblMainArtistName.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        lblMainArtistName.setForeground(new java.awt.Color(102, 102, 102));
        lblMainArtistName.setText("MAIN ARTIST");

        btnPlaySong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-play-button-circled-40.png"))); // NOI18N
        btnPlaySong.setContentAreaFilled(false);
        btnPlaySong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaySongActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        btnBackToMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-menu-20.png"))); // NOI18N
        btnBackToMenu.setContentAreaFilled(false);
        btnBackToMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToMenuActionPerformed(evt);
            }
        });

        btnBackToGenres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-music-library-20.png"))); // NOI18N
        btnBackToGenres.setContentAreaFilled(false);
        btnBackToGenres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToGenresActionPerformed(evt);
            }
        });

        btnBackToRock.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBackToRock.setForeground(new java.awt.Color(255, 255, 255));
        btnBackToRock.setText("ROCK");
        btnBackToRock.setContentAreaFilled(false);
        btnBackToRock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToRockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnBackToRock, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBackToMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBackToGenres, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(btnBackToMenu)
                .addGap(18, 18, 18)
                .addComponent(btnBackToGenres)
                .addGap(18, 18, 18)
                .addComponent(btnBackToRock)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NEW ARTIST LIKE");

        lblDidYouLike.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDidYouLike.setForeground(new java.awt.Color(255, 255, 255));
        lblDidYouLike.setText("Do you like this new artist?");

        btnLikeYes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLikeYes.setForeground(new java.awt.Color(255, 255, 255));
        btnLikeYes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-thumbs-up-50.png"))); // NOI18N
        btnLikeYes.setContentAreaFilled(false);
        btnLikeYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLikeYesActionPerformed(evt);
            }
        });

        btnNoLike.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNoLike.setForeground(new java.awt.Color(255, 255, 255));
        btnNoLike.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-thumbs-down-50.png"))); // NOI18N
        btnNoLike.setContentAreaFilled(false);
        btnNoLike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoLikeActionPerformed(evt);
            }
        });

        lblPromptNextFrm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPromptNextFrm.setForeground(new java.awt.Color(255, 255, 255));
        lblPromptNextFrm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPromptNextFrm.setText("(message)");

        btnGenerateNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-memories-100 (1).png"))); // NOI18N
        btnGenerateNew.setContentAreaFilled(false);
        btnGenerateNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateNewActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("GENERATE A NEW ARTIST");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblSimilarName)
                                .addGap(0, 0, 0)
                                .addComponent(btnPlaySong))
                            .addComponent(lblMainArtistName)
                            .addComponent(jLabel1))
                        .addContainerGap(439, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblSimilarCode, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnGenerateNew)
                                        .addGap(45, 45, 45))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDidYouLike)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnLikeYes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(69, 69, 69)
                                        .addComponent(btnNoLike, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16))))
                            .addComponent(lblPromptNextFrm, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(lblMainArtistName)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblSimilarName)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPlaySong, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblSimilarCode, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(59, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(btnGenerateNew)
                        .addGap(40, 40, 40)
                        .addComponent(lblDidYouLike)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLikeYes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNoLike, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPromptNextFrm)
                        .addGap(120, 120, 120))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlaySongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaySongActionPerformed
        //Call playMusic method from main class
        playMusic(musicFile);
        
        //Make preference question visible
        btnLikeYes.setVisible(true);
        btnNoLike.setVisible(true);
        lblDidYouLike.setVisible(true);
    }//GEN-LAST:event_btnPlaySongActionPerformed

    private void btnBackToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToMenuActionPerformed
        //Make menu form visible
        new FrmMenuForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackToMenuActionPerformed

    private void btnBackToGenresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToGenresActionPerformed
        //Make genres form visible
        new FrmGenresForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackToGenresActionPerformed

    private void btnBackToRockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToRockActionPerformed
        //Make rock form visible
        new FrmRockForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackToRockActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        //Sets JLabel to String value from genre form
        lblMainArtistName.setText(artist);
        
        //Randomly generates number depending on main artist chosen
        switch (artist)  {
            case "WEEZER": sub = (int)(3 * Math.random() + 0); break;
            case "METALLICA": sub = (int)(3 * Math.random() + 3); break;
            case "GREEN DAY": sub = (int)(3 * Math.random() + 6); break;
            case "TWENTY ONE PILOTS": sub = (int)(3 * Math.random() + 9); break;
            case "LINKIN PARK": sub = (int)(3 * Math.random() + 12); break;
            case "FALL OUT BOY": sub = (int)(3 * Math.random() + 15); break;
            case "FOO FIGHTERS": sub = (int)(3 * Math.random() + 18); break;
            case "FUN.": sub = (int)(3 * Math.random() + 21); break;
            case "JOHN MAYER": sub = (int)(3 * Math.random() + 24); break;
            case "PARAMORE": sub = (int)(3 * Math.random() + 27); break;
        }   
        
        //Declare and initialize String array for genre subartists
        String [] rock = new String [30];
        
        //Assign values to String array for genre subartists
        rock[0] = "CAKE";
        rock[1] = "SUGAR RAY";
        rock[2] = "THIRD EYE BLIND";
        rock[3] = "SLAYER";
        rock[4] = "PANTERA";
        rock[5] = "ANTHRAX";
        rock[6] = "SUM 41";
        rock[7] = "SIMPLE PLAN";
        rock[8] = "BOWLING FOR SOUP";
        rock[9] = "PANIC! AT THE DISCO";
        rock[10] = "X AMBASSADORS";
        rock[11] = "WATERPARKS";
        rock[12] = "PAPA ROACH";
        rock[13] = "DISTURBED";
        rock[14] = "STONE SOUR";
        rock[15] = "MY CHEMICAL ROMANCE";
        rock[16] = "WE THE KINGS";
        rock[17] = "MARIANAS TRENCH";
        rock[18] = "BUSH";
        rock[19] = "AUDIOSLAVE";
        rock[20] = "VELVET REVOLVER";
        rock[21] = "NEON TREES";
        rock[22] = "HOT CHELLE RAE";
        rock[23] = "AMERICAN AUTHORS";
        rock[24] = "JASON MRAZ";
        rock[25] = "TRAIN";
        rock[26] = "FIVE FOR FIGHTING";
        rock[27] = "THE ALL-AMERICAN REJECTS";
        rock[28] = "BOYS LIKE GIRLS";
        rock[29] = "ALL TIME LOW";
        
        //Assigns spotify code images to variable names
        ImageIcon codeCake = new ImageIcon("src\\codes\\Cake.jpg");
        ImageIcon codeRay = new ImageIcon("src\\codes\\SugarRay.jpg");
        ImageIcon codeBlind = new ImageIcon("src\\codes\\ThirdEyeBlind.jpg");
        ImageIcon codeSlayer = new ImageIcon("src\\codes\\Slayer.jpg");
        ImageIcon codePantera = new ImageIcon("src\\codes\\Pantera.jpg");
        ImageIcon codeAnthrax = new ImageIcon("src\\codes\\Anthrax.jpg");
        ImageIcon codeSum = new ImageIcon("src\\codes\\Sum41.jpg");
        ImageIcon codePlan = new ImageIcon("src\\codes\\SimplePlan.jpg");
        ImageIcon codeSoup = new ImageIcon("src\\codes\\BowlingForSoup.jpg");
        ImageIcon codePanic = new ImageIcon("src\\codes\\PanicAtTheDisco.jpg");
        ImageIcon codeX = new ImageIcon("src\\codes\\XAmbassadors.jpg");
        ImageIcon codeWaterparks = new ImageIcon("src\\codes\\Waterparks.jpg");
        ImageIcon codePapa = new ImageIcon("src\\codes\\PapaRoach.jpg");
        ImageIcon codeDisturbed = new ImageIcon("src\\codes\\Disturbed.jpg");
        ImageIcon codeStone = new ImageIcon("src\\codes\\StoneSour.jpg");
        ImageIcon codeRomance = new ImageIcon("src\\codes\\MyChemicalRomance.jpg");
        ImageIcon codeKings = new ImageIcon("src\\codes\\WeTheKings.jpg");
        ImageIcon codeTrench = new ImageIcon("src\\codes\\MarianasTrench.jpg");
        ImageIcon codeBush = new ImageIcon("src\\codes\\Bush.jpg");
        ImageIcon codeAudio = new ImageIcon("src\\codes\\Audioslave.jpg");
        ImageIcon codeVelvet = new ImageIcon("src\\codes\\VelvetRevolver.jpg");
        ImageIcon codeNeon = new ImageIcon("src\\codes\\NeonTrees.jpg");
        ImageIcon codeRae = new ImageIcon("src\\codes\\HotChelleRae.jpg");
        ImageIcon codeAuthors = new ImageIcon("src\\codes\\AmericanAuthors.jpg");
        ImageIcon codeMraz = new ImageIcon("src\\codes\\JasonMraz.jpg");
        ImageIcon codeTrain = new ImageIcon("src\\codes\\Train.jpg");
        ImageIcon codeFighting = new ImageIcon("src\\codes\\FiveForFighting.jpg");
        ImageIcon codeRejects = new ImageIcon("src\\codes\\TheAllAmericanRejects.jpg");
        ImageIcon codeBoys = new ImageIcon("src\\codes\\BoysLikeGirls.jpg");
        ImageIcon codeLow = new ImageIcon("src\\codes\\AllTimeLow.jpg");
        
        //Form output depending on randomly generated number
        switch (sub){
            case 0: lblSimilarName.setText(rock[sub]);
                    lblSimilarCode.setIcon(codeCake); 
                    musicFile = "src\\audios\\Cake.wav"; break;
            case 1: lblSimilarName.setText(rock[sub]); 
                    lblSimilarCode.setIcon(codeRay); 
                    musicFile = "src\\audios\\SugarRay.wav"; break;
            case 2: lblSimilarName.setText(rock[sub]); 
                    lblSimilarCode.setIcon(codeBlind); 
                    musicFile = "src\\audios\\ThirdEyeBlind.wav"; break;
                    
            case 3: lblSimilarName.setText(rock[sub]); 
                    lblSimilarCode.setIcon(codeSlayer); 
                    musicFile = "src\\audios\\Slayer.wav"; break;
            case 4: lblSimilarName.setText(rock[sub]); 
                    lblSimilarCode.setIcon(codePantera); 
                    musicFile = "src\\audios\\Pantera.wav"; break;
            case 5: lblSimilarName.setText(rock[sub]); 
                    lblSimilarCode.setIcon(codeAnthrax); 
                    musicFile = "src\\audios\\Anthrax.wav"; break;
                    
            case 6: lblSimilarName.setText(rock[sub]); 
                    lblSimilarCode.setIcon(codeSum); 
                    musicFile = "src\\audios\\Sum41.wav"; break;
            case 7: lblSimilarName.setText(rock[sub]); 
                    lblSimilarCode.setIcon(codePlan); 
                    musicFile = "src\\audios\\SimplePlan.wav"; break;        
            case 8: lblSimilarName.setText(rock[sub]); 
                    lblSimilarCode.setIcon(codeSoup); 
                    musicFile = "src\\audios\\BowlingForSoup.wav"; break; 
                    
            case 9: lblSimilarName.setText(rock[sub]); 
                    lblSimilarCode.setIcon(codePanic); 
                    musicFile = "src\\audios\\PanicAtTheDisco.wav"; break;
            case 10: lblSimilarName.setText(rock[sub]); 
                    lblSimilarCode.setIcon(codeX); 
                    musicFile = "src\\audios\\XAmbassadors.wav"; break;        
            case 11: lblSimilarName.setText(rock[sub]); 
                    lblSimilarCode.setIcon(codeWaterparks); 
                    musicFile = "src\\audios\\Waterparks.wav"; break; 
                    
            case 12: lblSimilarName.setText(rock[sub]); 
                    lblSimilarCode.setIcon(codePapa); 
                    musicFile = "src\\audios\\PapaRoach.wav"; break;
            case 13: lblSimilarName.setText(rock[sub]); 
                    lblSimilarCode.setIcon(codeDisturbed); 
                    musicFile = "src\\audios\\Disturbed.wav"; break;        
            case 14: lblSimilarName.setText(rock[sub]); 
                    lblSimilarCode.setIcon(codeStone); 
                    musicFile = "src\\audios\\StoneSour.wav"; break; 
                    
            case 15: lblSimilarName.setText(rock[sub]); 
                    lblSimilarCode.setIcon(codeRomance); 
                    musicFile = "src\\audios\\MyChemicalRomance.wav"; break;
            case 16: lblSimilarName.setText(rock[sub]); 
                    lblSimilarCode.setIcon(codeKings); 
                    musicFile = "src\\audios\\WeTheKings.wav"; break;        
            case 17: lblSimilarName.setText(rock[sub]); 
                    lblSimilarCode.setIcon(codeTrench); 
                    musicFile = "src\\audios\\MarianasTrench.wav"; break; 
                    
            case 18: lblSimilarName.setText(rock[sub]); 
                    lblSimilarCode.setIcon(codeBush); 
                    musicFile = "src\\audios\\Bush.wav"; break;
            case 19: lblSimilarName.setText(rock[sub]); 
                    lblSimilarCode.setIcon(codeAudio); 
                    musicFile = "src\\audios\\Audioslave.wav"; break;        
            case 20: lblSimilarName.setText(rock[sub]); 
                    lblSimilarCode.setIcon(codeVelvet); 
                    musicFile = "src\\audios\\VelvetRevolver.wav"; break; 
                    
            case 21: lblSimilarName.setText(rock[sub]); 
                    lblSimilarCode.setIcon(codeNeon); 
                    musicFile = "src\\audios\\NeonTrees.wav"; break;
            case 22: lblSimilarName.setText(rock[sub]); 
                    lblSimilarCode.setIcon(codeRae); 
                    musicFile = "src\\audios\\HotChelleRae.wav"; break;        
            case 23: lblSimilarName.setText(rock[sub]); 
                    lblSimilarCode.setIcon(codeAuthors); 
                    musicFile = "src\\audios\\AmericanAuthors.wav"; break;
                    
            case 24: lblSimilarName.setText(rock[sub]); 
                    lblSimilarCode.setIcon(codeMraz); 
                    musicFile = "src\\audios\\JasonMraz.wav"; break;
            case 25: lblSimilarName.setText(rock[sub]); 
                    lblSimilarCode.setIcon(codeTrain); 
                    musicFile = "src\\audios\\Train.wav"; break;        
            case 26: lblSimilarName.setText(rock[sub]); 
                    lblSimilarCode.setIcon(codeFighting); 
                    musicFile = "src\\audios\\FiveForFighting.wav"; break; 
                    
            case 27: lblSimilarName.setText(rock[sub]); 
                    lblSimilarCode.setIcon(codeRejects); 
                    musicFile = "src\\audios\\TheAllAmericanRejects.wav"; break;
            case 28: lblSimilarName.setText(rock[sub]); 
                    lblSimilarCode.setIcon(codeBoys); 
                    musicFile = "src\\audios\\BoysLikeGirls.wav"; break;        
            case 29: lblSimilarName.setText(rock[sub]); 
                    lblSimilarCode.setIcon(codeLow); 
                    musicFile = "src\\audios\\AllTimeLow.wav"; break; 
        }
        
        //Make preference question not visible
        btnLikeYes.setVisible(false);
        btnNoLike.setVisible(false);
        lblDidYouLike.setVisible(false);
        lblPromptNextFrm.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void btnLikeYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLikeYesActionPerformed
        //Makes message visible
        lblPromptNextFrm.setVisible(true);
        
        //Outputs appropriate message
        lblPromptNextFrm.setText("Great! Remember to scan their code on Spotify!");
    }//GEN-LAST:event_btnLikeYesActionPerformed

    private void btnNoLikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoLikeActionPerformed
        //Makes message visible
        lblPromptNextFrm.setVisible(true);
        
        //Outputs appropriate message
        lblPromptNextFrm.setText("Don't worry! There's lots more for you to find!");
    }//GEN-LAST:event_btnNoLikeActionPerformed

    private void btnGenerateNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateNewActionPerformed
        //Makes sub genre form visible again
        new FrmRockSub().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnGenerateNewActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmRockSub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRockSub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRockSub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRockSub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRockSub().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackToGenres;
    private javax.swing.JButton btnBackToMenu;
    private javax.swing.JButton btnBackToRock;
    private javax.swing.JButton btnGenerateNew;
    private javax.swing.JButton btnLikeYes;
    private javax.swing.JButton btnNoLike;
    private javax.swing.JButton btnPlaySong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDidYouLike;
    private javax.swing.JLabel lblMainArtistName;
    private javax.swing.JLabel lblPromptNextFrm;
    private javax.swing.JLabel lblSimilarCode;
    private javax.swing.JLabel lblSimilarName;
    // End of variables declaration//GEN-END:variables
}
