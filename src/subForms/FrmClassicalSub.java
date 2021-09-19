
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
public class FrmClassicalSub extends javax.swing.JFrame {

    //Declare and initialize variables
    String artist = FrmClassicalForm.classSub;
    String musicFile;
    int sub;
    
    /**
     * Creates new form FrmClassicalSub
     */
    public FrmClassicalSub() {
        initComponents();
    }

    //Method to carry String variable value to JLabel
    public FrmClassicalSub(String para){
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
        btnBackToClass = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnGenerateNew = new javax.swing.JButton();
        lblDidYouLike = new javax.swing.JLabel();
        btnLikeYes = new javax.swing.JButton();
        btnNoLike = new javax.swing.JButton();
        lblPromptNextFrm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));

        lblSimilarName.setFont(new java.awt.Font("Segoe UI", 1, 55)); // NOI18N
        lblSimilarName.setForeground(new java.awt.Color(255, 255, 255));
        lblSimilarName.setText("SUB ARTIST");

        lblMainArtistName.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        lblMainArtistName.setForeground(new java.awt.Color(51, 0, 0));
        lblMainArtistName.setText("MAIN ARTIST");

        btnPlaySong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-play-button-circled-40.png"))); // NOI18N
        btnPlaySong.setContentAreaFilled(false);
        btnPlaySong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaySongActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 0, 0));

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

        btnBackToClass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBackToClass.setForeground(new java.awt.Color(255, 255, 255));
        btnBackToClass.setText("CLASS");
        btnBackToClass.setContentAreaFilled(false);
        btnBackToClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToClassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnBackToClass, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
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
                .addComponent(btnBackToClass)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NEW ARTIST LIKE");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("GENERATE A NEW ARTIST");

        btnGenerateNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-memories-100 (1).png"))); // NOI18N
        btnGenerateNew.setContentAreaFilled(false);
        btnGenerateNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateNewActionPerformed(evt);
            }
        });

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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPlaySong))
                            .addComponent(lblMainArtistName)
                            .addComponent(jLabel1))
                        .addContainerGap(435, Short.MAX_VALUE))
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
                        .addGap(30, 30, 30)))
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
        //Make genre form visible
        new FrmGenresForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackToGenresActionPerformed

    private void btnBackToClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToClassActionPerformed
        //Make classical form visible
        new FrmClassicalForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackToClassActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        //Sets JLabel to String value from genre form
        lblMainArtistName.setText(artist);
        
        //Randomly generates number depending on main artist chosen
        switch (artist)  {
            case "JOHANN SEBASTIAN BACH": sub = (int)(3 * Math.random() + 0); break;
            case "WOLFGANG AMADES MOZART": sub = (int)(3 * Math.random() + 3); break;
            case "LUDWIG VAN BEETHOVEN": sub = (int)(3 * Math.random() + 6); break;
            case "RICHARD WAGNER": sub = (int)(3 * Math.random() + 9); break;
            case "JOHANNES BRAHMS": sub = (int)(3 * Math.random() + 12); break;
            case "ROBERT SCHUMANN": sub = (int)(3 * Math.random() + 15); break;
            case "RALPH VAUGHN WILLIAMS": sub = (int)(3 * Math.random() + 18); break;
            case "GUSTAV MAHLER": sub = (int)(3 * Math.random() + 21); break;
            case "FRANZ JOSEPH HAYDEN": sub = (int)(3 * Math.random() + 24); break;
            case "MICHEAL GIACCHINO": sub = (int)(3 * Math.random() + 27); break;
        }   
        
        //Declare and initialize String array for genre subartists
        String [] classical = new String [30];
        //Assign values to String array for genre subartists
        classical[0] = "ANTONIO VIVALDI";
        classical[1] = "FREDERIC CHOPIN";
        classical[2] = "EDVARD GRIEG";
        classical[3] = "GIACOMO PUCCINI";
        classical[4] = "GEORGE FRIDERIC HANDEL";
        classical[5] = "GABRIEL FAURE";
        classical[6] = "CLAUDE DEBUSSY";
        classical[7] = "PYOTR ILYICH TCHAIKOVSKY";
        classical[8] = "FRANZ LISZT";
        classical[9] = "HECTOR BERLIOZ";
        classical[10] = "RICHARD STRAUSS";
        classical[11] = "GIUSEPPE VERDI";
        classical[12] = "ANTONIO DVORAK";
        classical[13] = "MAURICE RAVEL";
        classical[14] = "FELIX MENDELSSOHN";
        classical[15] = "FRANZ SCHUBERT";
        classical[16] = "SERGEI RACHMANINOFF";
        classical[17] = "ARCANGELO CORELLI";
        classical[18] = "GEORGE BUTTERWORTH";
        classical[19] = "ERIK SATIE";
        classical[20] = "GUSTAV HOLST";
        classical[21] = "DMITRI SHOSTAKOVITCH";
        classical[22] = "LEONARD BERNSTEIN";
        classical[23] = "IGOR STRAVINSKY";
        classical[24] = "HENRY PURCELL";
        classical[25] = "GEORG PHILIPP TELEMANN";
        classical[26] = "TOMASO ALBINONI";
        classical[27] = "JOHN POWELL";
        classical[28] = "JOHN OTTMAN";
        classical[29] = "ALAN SILVESTRI";
        
        //Assigns spotify code images to variable names
        ImageIcon codeVivaldi = new ImageIcon("src\\codes\\AntonioVivaldi.jpg");
        ImageIcon codeChopin = new ImageIcon("src\\codes\\FredericChopin.jpg");
        ImageIcon codeGrieg = new ImageIcon("src\\codes\\EdvardGrieg.jpg");
        ImageIcon codePuccini = new ImageIcon("src\\codes\\GiacomoPuccini.jpg");
        ImageIcon codeHandel = new ImageIcon("src\\codes\\GeorgeFridericHandel.jpg");
        ImageIcon codeFaure = new ImageIcon("src\\codes\\GabrielFaure.jpg");
        ImageIcon codeDebussy = new ImageIcon("src\\codes\\ClaudeDebussy.jpg");
        ImageIcon codeTchaikovsky = new ImageIcon("src\\codes\\PyotrIlyichTchaikovsky.jpg");
        ImageIcon codeLiszt = new ImageIcon("src\\codes\\FranzLiszt.jpg");
        ImageIcon codeBerlioz = new ImageIcon("src\\codes\\HectorBerlioz.jpg");
        ImageIcon codeStrauss = new ImageIcon("src\\codes\\RichardStrauss.jpg");
        ImageIcon codeVerdi = new ImageIcon("src\\codes\\GiuseppeVerdi.jpg");
        ImageIcon codeDvorak = new ImageIcon("src\\codes\\AntonioDvorak.jpg");
        ImageIcon codeRavel = new ImageIcon("src\\codes\\MauriceRavel.jpg");
        ImageIcon codeMendelssohn = new ImageIcon("src\\codes\\FelixMendelssohn.jpg");
        ImageIcon codeSchubert = new ImageIcon("src\\codes\\FranzSchubert.jpg");
        ImageIcon codeRachmaninoff = new ImageIcon("src\\codes\\SergeiRachmaninoff.jpg");
        ImageIcon codeCorelli = new ImageIcon("src\\codes\\ArcangeloCorelli.jpg");
        ImageIcon codeButterworth = new ImageIcon("src\\codes\\GeorgeButterworth.jpg");
        ImageIcon codeSatie = new ImageIcon("src\\codes\\ErikSatie.jpg");
        ImageIcon codeHolst = new ImageIcon("src\\codes\\GustavHolst.jpg");
        ImageIcon codeShostakovitch = new ImageIcon("src\\codes\\DmitriShostakovitch.jpg");
        ImageIcon codeBernstein = new ImageIcon("src\\codes\\LeonardBernstein.jpg");
        ImageIcon codeStravinsky = new ImageIcon("src\\codes\\IgorStravinsky.jpg");
        ImageIcon codePurcell = new ImageIcon("src\\codes\\HenryPurcell.jpg");
        ImageIcon codeTelemann = new ImageIcon("src\\codes\\GeorgPhilippTelemann.jpg");
        ImageIcon codeAlbinoni = new ImageIcon("src\\codes\\TomasoAlbinoni.jpg");
        ImageIcon codePowell = new ImageIcon("src\\codes\\JohnPowell.jpg");
        ImageIcon codeOttman = new ImageIcon("src\\codes\\JohnOttman.jpg");
        ImageIcon codeSilvestri = new ImageIcon("src\\codes\\AlanSilvestri.jpg");
        
        //Form output depending on randomly generated number
        switch (sub){
            case 0: lblSimilarName.setText(String.valueOf(classical[sub]));
                    lblSimilarCode.setIcon(codeVivaldi); 
                    musicFile = "src\\audios\\AntonioVivaldi.wav"; break;
            case 1: lblSimilarName.setText(String.valueOf(classical[sub])); 
                    lblSimilarCode.setIcon(codeChopin); 
                    musicFile = "src\\audios\\FredericChopin.wav"; break;
            case 2: lblSimilarName.setText(String.valueOf(classical[sub])); 
                    lblSimilarCode.setIcon(codeGrieg); 
                    musicFile = "src\\audios\\EdvardGrieg.wav"; break;
                    
            case 3: lblSimilarName.setText(String.valueOf(classical[sub])); 
                    lblSimilarCode.setIcon(codePuccini); 
                    musicFile = "src\\audios\\GiacomoPuccini.wav"; break;
            case 4: lblSimilarName.setText(String.valueOf(classical[sub])); 
                    lblSimilarCode.setIcon(codeHandel); 
                    musicFile = "src\\audios\\GeorgeFridericHandel.wav"; break;
            case 5: lblSimilarName.setText(String.valueOf(classical[sub])); 
                    lblSimilarCode.setIcon(codeFaure); 
                    musicFile = "src\\audios\\GabrielFaure.wav"; break;
                    
            case 6: lblSimilarName.setText(String.valueOf(classical[sub])); 
                    lblSimilarCode.setIcon(codeDebussy); 
                    musicFile = "src\\audios\\ClaudeDebussy.wav"; break;
            case 7: lblSimilarName.setText(String.valueOf(classical[sub])); 
                    lblSimilarCode.setIcon(codeTchaikovsky); 
                    musicFile = "src\\audios\\PyotrIlyichTchaikovsky.wav"; break;        
            case 8: lblSimilarName.setText(String.valueOf(classical[sub])); 
                    lblSimilarCode.setIcon(codeLiszt); 
                    musicFile = "src\\audios\\FranzLiszt.wav"; break; 
                    
            case 9: lblSimilarName.setText(String.valueOf(classical[sub])); 
                    lblSimilarCode.setIcon(codeBerlioz); 
                    musicFile = "src\\audios\\HectorBerlioz.wav"; break;
            case 10: lblSimilarName.setText(String.valueOf(classical[sub])); 
                    lblSimilarCode.setIcon(codeStrauss); 
                    musicFile = "src\\audios\\RichardStrauss.wav"; break;        
            case 11: lblSimilarName.setText(String.valueOf(classical[sub])); 
                    lblSimilarCode.setIcon(codeVerdi); 
                    musicFile = "src\\audios\\GiuseppeVerdi.wav"; break;  
                    
            case 12: lblSimilarName.setText(String.valueOf(classical[sub])); 
                    lblSimilarCode.setIcon(codeDvorak); 
                    musicFile = "src\\audios\\AntonioDvorak.wav"; break;
            case 13: lblSimilarName.setText(String.valueOf(classical[sub])); 
                    lblSimilarCode.setIcon(codeRavel); 
                    musicFile = "src\\audios\\MauriceRavel.wav"; break;        
            case 14: lblSimilarName.setText(String.valueOf(classical[sub])); 
                    lblSimilarCode.setIcon(codeMendelssohn); 
                    musicFile = "src\\audios\\FelixMendelssohn.wav"; break;
                    
            case 15: lblSimilarName.setText(String.valueOf(classical[sub])); 
                    lblSimilarCode.setIcon(codeSchubert); 
                    musicFile = "src\\audios\\FranzSchubert.wav"; break;
            case 16: lblSimilarName.setText(String.valueOf(classical[sub])); 
                    lblSimilarCode.setIcon(codeRachmaninoff); 
                    musicFile = "src\\audios\\SergeiRachmaninoff.wav"; break;        
            case 17: lblSimilarName.setText(String.valueOf(classical[sub])); 
                    lblSimilarCode.setIcon(codeCorelli); 
                    musicFile = "src\\audios\\ArcangeloCorelli.wav"; break;  
                    
            case 18: lblSimilarName.setText(String.valueOf(classical[sub])); 
                    lblSimilarCode.setIcon(codeButterworth); 
                    musicFile = "src\\audios\\GeorgeButterworth.wav"; break;
            case 19: lblSimilarName.setText(String.valueOf(classical[sub])); 
                    lblSimilarCode.setIcon(codeSatie); 
                    musicFile = "src\\audios\\ErikSatie.wav"; break;        
            case 20: lblSimilarName.setText(String.valueOf(classical[sub])); 
                    lblSimilarCode.setIcon(codeHolst); 
                    musicFile = "src\\audios\\GustavHolst.wav"; break; 
                    
            case 21: lblSimilarName.setText(String.valueOf(classical[sub])); 
                    lblSimilarCode.setIcon(codeShostakovitch); 
                    musicFile = "src\\audios\\DmitriShostakovitch.wav"; break;
            case 22: lblSimilarName.setText(String.valueOf(classical[sub])); 
                    lblSimilarCode.setIcon(codeBernstein); 
                    musicFile = "src\\audios\\LeonardBernstein.wav"; break;        
            case 23: lblSimilarName.setText(String.valueOf(classical[sub])); 
                    lblSimilarCode.setIcon(codeStravinsky); 
                    musicFile = "src\\audios\\IgorStravinsky.wav"; break;
                    
            case 24: lblSimilarName.setText(String.valueOf(classical[sub])); 
                    lblSimilarCode.setIcon(codePurcell); 
                    musicFile = "src\\audios\\HenryPurcell.wav"; break;
            case 25: lblSimilarName.setText(String.valueOf(classical[sub])); 
                    lblSimilarCode.setIcon(codeTelemann); 
                    musicFile = "src\\audios\\GeorgPhilippTelemann.wav"; break;        
            case 26: lblSimilarName.setText(String.valueOf(classical[sub])); 
                    lblSimilarCode.setIcon(codeAlbinoni); 
                    musicFile = "src\\audios\\TomasoAlbinoni.wav"; break; 
                    
            case 27: lblSimilarName.setText(String.valueOf(classical[sub])); 
                    lblSimilarCode.setIcon(codePowell); 
                    musicFile = "src\\audios\\JohnPowell.wav"; break;
            case 28: lblSimilarName.setText(String.valueOf(classical[sub])); 
                    lblSimilarCode.setIcon(codeOttman); 
                    musicFile = "src\\audios\\JohnOttman.wav"; break;        
            case 29: lblSimilarName.setText(String.valueOf(classical[sub])); 
                    lblSimilarCode.setIcon(codeSilvestri); 
                    musicFile = "src\\audios\\AlanSilvestri.wav"; break; 
        }
        
        //Make preference question not visible
        btnLikeYes.setVisible(false);
        btnNoLike.setVisible(false);
        lblDidYouLike.setVisible(false);
        lblPromptNextFrm.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void btnGenerateNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateNewActionPerformed
        //Makes sub genre form visible again
        new FrmClassicalSub().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnGenerateNewActionPerformed

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
            java.util.logging.Logger.getLogger(FrmClassicalSub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmClassicalSub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmClassicalSub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmClassicalSub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmClassicalSub().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackToClass;
    private javax.swing.JButton btnBackToGenres;
    private javax.swing.JButton btnBackToMenu;
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
