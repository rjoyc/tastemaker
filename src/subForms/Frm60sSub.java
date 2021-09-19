
import static cpt.CPT.playMusic;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 353365091
 */
public class Frm60sSub extends javax.swing.JFrame {
    
    //Declare and initialize variables
    String artist = Frm60sForm.sixtiesSub;
    int sub;
    String musicPath;

    /**
     * Creates new form Frm60sSub
     */
    public Frm60sSub() {
        initComponents();
    }
    
    //Method to carry String variable value to JLabel
    public Frm60sSub(String para){
        initComponents();
        
        lblMainArtist.setText(para);
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
        jPanel2 = new javax.swing.JPanel();
        btnBackToMenu = new javax.swing.JButton();
        btnBackToGenres = new javax.swing.JButton();
        btnBackTo60s = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblMainArtist = new javax.swing.JLabel();
        lblSubArtist = new javax.swing.JLabel();
        btnPlaySub = new javax.swing.JButton();
        lblSubArtistCode = new javax.swing.JLabel();
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

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(165, 165, 165));

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

        btnBackTo60s.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBackTo60s.setForeground(new java.awt.Color(255, 255, 255));
        btnBackTo60s.setText("60s");
        btnBackTo60s.setContentAreaFilled(false);
        btnBackTo60s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackTo60sActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBackToMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBackToGenres, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnBackTo60s)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(btnBackToMenu)
                .addGap(18, 18, 18)
                .addComponent(btnBackToGenres)
                .addGap(18, 18, 18)
                .addComponent(btnBackTo60s)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NEW ARTIST LIKE");

        lblMainArtist.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        lblMainArtist.setForeground(new java.awt.Color(165, 165, 165));
        lblMainArtist.setText("MAIN ARTIST");

        lblSubArtist.setFont(new java.awt.Font("Segoe UI", 1, 55)); // NOI18N
        lblSubArtist.setForeground(new java.awt.Color(255, 255, 255));
        lblSubArtist.setText("SUB ARTIST");

        btnPlaySub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-play-button-circled-40.png"))); // NOI18N
        btnPlaySub.setContentAreaFilled(false);
        btnPlaySub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaySubActionPerformed(evt);
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
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblSubArtist)
                                .addGap(0, 0, 0)
                                .addComponent(btnPlaySub))
                            .addComponent(lblMainArtist)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblSubArtistCode, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                    .addComponent(lblPromptNextFrm, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel1))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(lblMainArtist)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblSubArtist))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnPlaySub, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblSubArtistCode, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnBackToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToMenuActionPerformed
        //Make Menu form visible
        new FrmMenuForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackToMenuActionPerformed

    private void btnBackToGenresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToGenresActionPerformed
        //Make Genres form visible
        new FrmGenresForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackToGenresActionPerformed

    private void btnBackTo60sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackTo60sActionPerformed
        //Make 60s form visible
        new Frm60sForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackTo60sActionPerformed

    private void btnPlaySubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaySubActionPerformed
        //Call playMusic method from main class
        playMusic(musicPath);
        
        //Make preference question visible
        btnLikeYes.setVisible(true);
        btnNoLike.setVisible(true);
        lblDidYouLike.setVisible(true);
    }//GEN-LAST:event_btnPlaySubActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Sets JLabel to String value from genre form
        lblMainArtist.setText(artist);
        
        //Randomly generates number depending on main artist chosen
        switch (artist) {
            case "PAUL ANKA": sub = (int)(3*Math.random()+0); break;
            case "NAT KING COLE": sub = (int)(3*Math.random()+3); break;
            case "ELVIS PRESLEY": sub = (int)(3*Math.random()+6); break;
            case "FRANKIE VALLI": sub = (int)(3*Math.random()+9); break;
            case "THE BEATLES": sub = (int)(3*Math.random()+12); break;
            case "THE TEMPTATIONS": sub = (int)(3*Math.random()+15); break;
            case "THE BEACH BOYS": sub = (int)(3*Math.random()+18); break;
            case "THE JACKSON 5": sub = (int)(3*Math.random()+21); break;
            case "ETTA JAMES": sub = (int)(3*Math.random()+24); break;
            case "THE DOORS": sub = (int)(3*Math.random()+27); break;
            default:
                break;
        }
        
        //Declare and initialize String array for genre subartists
        String [] sixties = new String [30];
        
        //Assign values to String array for genre subartists
        sixties [0] = "NEIL SEDAKA";
        sixties [1] = "PAT BOONE";
        sixties [2] = "BOBBY VINTON";
        sixties [3] = "PERRY COMO";
        sixties [4] = "HARRY CONNICK, JR.";
        sixties [5] = "JULIE LONDON";
        sixties [6] = "BUDDY HOLLY";
        sixties [7] = "ROY ORBINSON";
        sixties [8] = "JERRY LEE LEWIS";
        sixties [9] = "NEIL SEDAKA";
        sixties [10] = "RIGHTEOUS BROTHERS";
        sixties [11] = "THE UNION GAP";
        sixties [12] = "JOHN LENNON";
        sixties [13] = "GEORGE HARRISON";
        sixties [14] = "PAUL MCCARTNEY";
        sixties [15] = "THE MIRACLES";
        sixties [16] = "THE SUPREMES";
        sixties [17] = "SMOKEY ROBINSON";
        sixties [18] = "THE MONKEES";
        sixties [19] = "THE LOVIN' SPOONFUL";
        sixties [20] = "THE TURTLES";
        sixties [21] = "COMMODORES";
        sixties [22] = "STEVIE WONDER";
        sixties [23] = "FOUR TOPS";
        sixties [24] = "SOLOMON BURKE";
        sixties [25] = "SAM COOKE";
        sixties [26] = "JACKIE WILSON";
        sixties [27] = "JIM MORRISON";
        sixties [28] = "JEFFERSON AIRPLANE";
        sixties [29] = "JIMI HENDRIX";
        
        //Form output depending on randomly generated number
        switch (sub){
            case 0:
                lblSubArtist.setText(sixties[sub]);
                musicPath = "src\\Audios\\NeilSedaka.wav";
                ImageIcon codeNeilSedaka = new ImageIcon("src\\codes\\NeilSedaka.jpg");
                lblSubArtistCode.setIcon(codeNeilSedaka);
                break;
            case 1:
                lblSubArtist.setText(sixties[sub]);
                musicPath = "src\\Audios\\PatBoone.wav";
                ImageIcon codePatBoone = new ImageIcon("src\\codes\\PatBoone.jpg");
                lblSubArtistCode.setIcon(codePatBoone);
                break;
            case 2:
                lblSubArtist.setText(sixties[sub]);
                musicPath = "src\\Audios\\BobbyVinton.wav";
                ImageIcon codeBobbyVinton = new ImageIcon("src\\codes\\BobbyVinton.jpg");
                lblSubArtistCode.setIcon(codeBobbyVinton);
                break;
                
            case 3:
                lblSubArtist.setText(sixties[sub]);
                musicPath = "src\\Audios\\PerryComo.wav";
                ImageIcon codePerryComo = new ImageIcon("src\\codes\\PerryComo.jpg");
                lblSubArtistCode.setIcon(codePerryComo);
                break;  
            case 4:
                lblSubArtist.setText(sixties[sub]);
                musicPath = "src\\Audios\\HarryConnickJr.wav";
                ImageIcon codeHarryConnickJr = new ImageIcon("src\\codes\\HarryConnickJr.jpg");
                lblSubArtistCode.setIcon(codeHarryConnickJr);
                break;     
            case 5:
                lblSubArtist.setText(sixties[sub]);
                musicPath = "src\\Audios\\JulieLondon.wav";
                ImageIcon codeJulieLondon = new ImageIcon("src\\codes\\JulieLondon.jpg");
                lblSubArtistCode.setIcon(codeJulieLondon);
                break;   
                
            case 6:
                lblSubArtist.setText(sixties[sub]);
                musicPath = "src\\Audios\\BuddyHolly.wav";
                ImageIcon codeBuddyHolly = new ImageIcon("src\\codes\\BuddyHolly.jpg");
                lblSubArtistCode.setIcon(codeBuddyHolly);
                break;  
            case 7:
                lblSubArtist.setText(sixties[sub]);
                musicPath = "src\\Audios\\RoyOrbison.wav";
                ImageIcon codeRoyOrbison = new ImageIcon("src\\codes\\RoyOrbison.jpg");
                lblSubArtistCode.setIcon(codeRoyOrbison);
                break;     
            case 8:
                lblSubArtist.setText(sixties[sub]);
                musicPath = "src\\Audios\\JerryLeeLewis.wav";
                ImageIcon codeJerryLeeLewis = new ImageIcon("src\\codes\\JerryLeeLewis.jpg");
                lblSubArtistCode.setIcon(codeJerryLeeLewis);
                break;
                
            case 9:
                lblSubArtist.setText(sixties[sub]);
                musicPath = "src\\Audios\\NeilSedaka.wav";
                ImageIcon codeNeilSedaka2 = new ImageIcon("src\\codes\\NeilSedaka.jpg");
                lblSubArtistCode.setIcon(codeNeilSedaka2);
                break;  
            case 10:
                lblSubArtist.setText(sixties[sub]);
                musicPath = "src\\Audios\\TheRighteousBrothers.wav";
                ImageIcon codeTheRighteousBrothers = new ImageIcon("src\\codes\\TheRighteousBrothers.jpg");
                lblSubArtistCode.setIcon(codeTheRighteousBrothers);
                break;     
            case 11:
                lblSubArtist.setText(sixties[sub]);
                musicPath = "src\\Audios\\UnionGap.wav";
                ImageIcon codeGaryPuckett_TheUnionGap = new ImageIcon("src\\codes\\GaryPuckett_TheUnionGap.jpg");
                lblSubArtistCode.setIcon(codeGaryPuckett_TheUnionGap);
                break;     
                
            case 12:
                lblSubArtist.setText(sixties[sub]);
                musicPath = "src\\Audios\\JohnLennon.wav";
                ImageIcon codeJohnLennon = new ImageIcon("src\\codes\\JohnLennon.jpg");
                lblSubArtistCode.setIcon(codeJohnLennon);
                break;  
            case 13:
                lblSubArtist.setText(sixties[sub]);
                musicPath = "src\\Audios\\GeorgeHarrison.wav";
                ImageIcon codeGeorgeHarrison = new ImageIcon("src\\codes\\GeorgeHarrison.jpg");
                lblSubArtistCode.setIcon(codeGeorgeHarrison);
                break;     
            case 14:
                lblSubArtist.setText(sixties[sub]);
                musicPath = "src\\Audios\\PaulMcCartney.wav";
                ImageIcon codePaulMcCartney = new ImageIcon("src\\codes\\PaulMcCartney.jpg");
                lblSubArtistCode.setIcon(codePaulMcCartney);
                break; 
                
            case 15:
                lblSubArtist.setText(sixties[sub]);
                musicPath = "src\\Audios\\TheMiracles.wav";
                ImageIcon codeTheMiracles = new ImageIcon("src\\codes\\TheMiracles.jpg");
                lblSubArtistCode.setIcon(codeTheMiracles);
                break;  
            case 16:
                lblSubArtist.setText(sixties[sub]);
                musicPath = "src\\Audios\\TheSupremes.wav";
                ImageIcon codeTheSupremes = new ImageIcon("src\\codes\\TheSupremes.jpg");
                lblSubArtistCode.setIcon(codeTheSupremes);
                break;     
            case 17:
                lblSubArtist.setText(sixties[sub]);
                musicPath = "src\\Audios\\SmokeyRobinson.wav";
                ImageIcon codeSmokeyRobinson = new ImageIcon("src\\codes\\SmokeyRobinson.jpg");
                lblSubArtistCode.setIcon(codeSmokeyRobinson);
                break;      
                
            case 18:
                lblSubArtist.setText(sixties[sub]);
                musicPath = "src\\Audios\\TheMonkees.wav";
                ImageIcon codeTheMonkees = new ImageIcon("src\\codes\\TheMonkees.jpg");
                lblSubArtistCode.setIcon(codeTheMonkees);
                break;  
            case 19:
                lblSubArtist.setText(sixties[sub]);
                musicPath = "src\\Audios\\TheLovinSpoonful.wav";
                ImageIcon codeTheLovinSpoonful = new ImageIcon("src\\codes\\TheLovinSpoonful.jpg");
                lblSubArtistCode.setIcon(codeTheLovinSpoonful);
                break;     
            case 20:
                lblSubArtist.setText(sixties[sub]);
                musicPath = "src\\Audios\\TheTurtles.wav";
                ImageIcon codeTheTurtles = new ImageIcon("src\\codes\\TheTurtles.jpg");
                lblSubArtistCode.setIcon(codeTheTurtles);
                break;      
                
            case 21:
                lblSubArtist.setText(sixties[sub]);
                musicPath = "src\\Audios\\Commodores.wav";
                ImageIcon codeCommodores = new ImageIcon("src\\codes\\Commodores.jpg");
                lblSubArtistCode.setIcon(codeCommodores);
                break;  
            case 22:
                lblSubArtist.setText(sixties[sub]);
                musicPath = "src\\Audios\\StevieWonder.wav";
                ImageIcon codeStevieWonder = new ImageIcon("src\\codes\\StevieWonder2.jpg");
                lblSubArtistCode.setIcon(codeStevieWonder);
                break;     
            case 23:
                lblSubArtist.setText(sixties[sub]);
                musicPath = "src\\Audios\\FourTops.wav";
                ImageIcon codeFourTops = new ImageIcon("src\\codes\\FourTops.jpg");
                lblSubArtistCode.setIcon(codeFourTops);
                break;     
                
            case 24:
                lblSubArtist.setText(sixties[sub]);
                musicPath = "src\\Audios\\SolomonBurke.wav";
                ImageIcon codeSolomonBurke = new ImageIcon("src\\codes\\SolomonBurke.jpg");
                lblSubArtistCode.setIcon(codeSolomonBurke);
                break;  
            case 25:
                lblSubArtist.setText(sixties[sub]);
                musicPath = "src\\Audios\\SamCooke.wav";
                ImageIcon codeSamCooke = new ImageIcon("src\\codes\\SamCooke.jpg");
                lblSubArtistCode.setIcon(codeSamCooke);
                break;     
            case 26:
                lblSubArtist.setText(sixties[sub]);
                musicPath = "src\\Audios\\JackieWilson.wav";
                ImageIcon codeJackieWilson = new ImageIcon("src\\codes\\JackieWilson.jpg");
                lblSubArtistCode.setIcon(codeJackieWilson);
                break;  
                
            case 27:
                lblSubArtist.setText(sixties[sub]);
                musicPath = "src\\Audios\\JimMorrison.wav";
                ImageIcon codeJimMorrison = new ImageIcon("src\\codes\\JimMorrison.jpg");
                lblSubArtistCode.setIcon(codeJimMorrison);
                break;  
            case 28:
                lblSubArtist.setText(sixties[sub]);
                musicPath = "src\\Audios\\JeffersonAirplane.wav";
                ImageIcon codeJeffersonAirplane = new ImageIcon("src\\codes\\JeffersonAirplane.jpg");
                lblSubArtistCode.setIcon(codeJeffersonAirplane);
                break;     
            case 29:
                lblSubArtist.setText(sixties[sub]);
                musicPath = "src\\Audios\\JimiHendrix.wav";
                ImageIcon codeJimiHendrix = new ImageIcon("src\\codes\\JimiHendrix.jpg");
                lblSubArtistCode.setIcon(codeJimiHendrix);
                break;        
            default:
                break;
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
        new Frm60sSub().setVisible(true);
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
            java.util.logging.Logger.getLogger(Frm60sSub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm60sSub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm60sSub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm60sSub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm60sSub().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackTo60s;
    private javax.swing.JButton btnBackToGenres;
    private javax.swing.JButton btnBackToMenu;
    private javax.swing.JButton btnGenerateNew;
    private javax.swing.JButton btnLikeYes;
    private javax.swing.JButton btnNoLike;
    private javax.swing.JButton btnPlaySub;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDidYouLike;
    private javax.swing.JLabel lblMainArtist;
    private javax.swing.JLabel lblPromptNextFrm;
    private javax.swing.JLabel lblSubArtist;
    private javax.swing.JLabel lblSubArtistCode;
    // End of variables declaration//GEN-END:variables
}