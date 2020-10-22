/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texteditor.views;

import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.rtf.RTFEditorKit;
import texteditor.controller.MainEditorController;
/**
 *
 * @author ASUS
 */
public class MainEditor extends javax.swing.JFrame {
    private final MainEditorController controller;
    private final RTFEditorKit rtf;
    private final StyleContext context;
    private final GraphicsEnvironment graphicEnvironment;
    private final SimpleAttributeSet defaultAttrib, FontAttrib, alligmentAttrib;
        
    /**
     * Creates new form MainEditor
     */
    public MainEditor() {
        // set app icon
        URL iconURL = getClass().getResource("/assets/app_logo.png");
        ImageIcon icon = new ImageIcon(iconURL);
        setIconImage(icon.getImage());
        //set start window position
        setLocation(200, 100);
        String c;
        controller = new MainEditorController(this);
        graphicEnvironment=GraphicsEnvironment.getLocalGraphicsEnvironment();
        rtf=new RTFEditorKit();
        defaultAttrib = new SimpleAttributeSet();
        FontAttrib = new SimpleAttributeSet();
        alligmentAttrib = new SimpleAttributeSet();
        
        initComponents();
        textArea.setEditorKit(rtf);
        context = new StyleContext();

        //set default Style
        StyleConstants.setFontFamily(defaultAttrib, "Arial");
        textArea.setCharacterAttributes(defaultAttrib, true);
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popUpRightClick = new javax.swing.JPopupMenu();
        popCopy = new javax.swing.JMenuItem();
        popPaste = new javax.swing.JMenuItem();
        popDelete = new javax.swing.JMenuItem();
        loadFile = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextPane();
        jToolBar1 = new javax.swing.JToolBar();
        btnBold = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnItalic = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnUnderline = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cbFontSize = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cbFontFamily = new javax.swing.JComboBox<>();
        jToolBar2 = new javax.swing.JToolBar();
        btnLeft = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnCenter = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnRight = new javax.swing.JButton();
        jToolBar3 = new javax.swing.JToolBar();
        btnTxtColor = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnHighLight = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCol = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLine = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtChar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtWords = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnFile = new javax.swing.JMenu();
        file_open = new javax.swing.JMenuItem();
        file_save = new javax.swing.JMenuItem();
        mnEdit = new javax.swing.JMenu();
        edit_copy = new javax.swing.JMenuItem();
        edit_paste = new javax.swing.JMenuItem();

        popCopy.setText("jMenuItem1");
        popCopy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                popCopyMouseClicked(evt);
            }
        });
        popCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popCopyActionPerformed(evt);
            }
        });
        popUpRightClick.add(popCopy);

        popPaste.setText("jMenuItem2");
        popPaste.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                popPasteMouseClicked(evt);
            }
        });
        popPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popPasteActionPerformed(evt);
            }
        });
        popUpRightClick.add(popPaste);

        popDelete.setText("jMenuItem3");
        popDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popDeleteActionPerformed(evt);
            }
        });
        popUpRightClick.add(popDelete);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyEditor");
        setMinimumSize(new java.awt.Dimension(900, 480));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jScrollPane1.setMinimumSize(new java.awt.Dimension(100, 100));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(720, 480));

        textArea.setVerifyInputWhenFocusTarget(false);
        textArea.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                textAreaCaretUpdate(evt);
            }
        });
        textArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textAreaMouseClicked(evt);
            }
        });
        textArea.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                textAreaCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jScrollPane1.setViewportView(textArea);

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setBorder(javax.swing.BorderFactory.createTitledBorder("Text"));
        jToolBar1.setFloatable(false);
        jToolBar1.setInheritsPopupMenu(true);
        jToolBar1.setMaximumSize(new java.awt.Dimension(720, 1000));
        jToolBar1.setMinimumSize(new java.awt.Dimension(50, 32));
        jToolBar1.setPreferredSize(new java.awt.Dimension(200, 25));

        btnBold.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bold_logo.png"))); // NOI18N
        btnBold.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBold.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBold.setFocusable(false);
        btnBold.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBold.setMargin(new java.awt.Insets(5, 14, 2, 14));
        btnBold.setMaximumSize(new java.awt.Dimension(40, 25));
        btnBold.setMinimumSize(new java.awt.Dimension(40, 30));
        btnBold.setPreferredSize(new java.awt.Dimension(45, 19));
        btnBold.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoldActionPerformed(evt);
            }
        });
        jToolBar1.add(btnBold);

        jLabel7.setText("  ");
        jToolBar1.add(jLabel7);

        btnItalic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Italic_logo1.png"))); // NOI18N
        btnItalic.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnItalic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnItalic.setFocusable(false);
        btnItalic.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnItalic.setMaximumSize(new java.awt.Dimension(40, 25));
        btnItalic.setMinimumSize(new java.awt.Dimension(40, 25));
        btnItalic.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnItalic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItalicActionPerformed(evt);
            }
        });
        jToolBar1.add(btnItalic);

        jLabel6.setText("  ");
        jToolBar1.add(jLabel6);

        btnUnderline.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/underline-logo1.png"))); // NOI18N
        btnUnderline.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUnderline.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUnderline.setFocusable(false);
        btnUnderline.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUnderline.setMaximumSize(new java.awt.Dimension(40, 25));
        btnUnderline.setMinimumSize(new java.awt.Dimension(40, 25));
        btnUnderline.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUnderline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnderlineActionPerformed(evt);
            }
        });
        jToolBar1.add(btnUnderline);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("  Size : ");
        jToolBar1.add(jLabel5);

        cbFontSize.setEditable(true);
        cbFontSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{
            "6","8","11","12","14","16","18","20","24","28","32","35",
            "40","55","60","70"}));
cbFontSize.setMaximumSize(new java.awt.Dimension(50, 32767));
cbFontSize.setMinimumSize(new java.awt.Dimension(50, 20));
cbFontSize.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        cbFontSizeActionPerformed(evt);
    }
    });
    jToolBar1.add(cbFontSize);

    jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    jLabel11.setText("  Font : ");
    jToolBar1.add(jLabel11);

    cbFontFamily.setModel(new javax.swing.DefaultComboBoxModel<>(graphicEnvironment.getAvailableFontFamilyNames()));
    cbFontFamily.setMaximumSize(new java.awt.Dimension(100, 32767));
    cbFontFamily.setMinimumSize(new java.awt.Dimension(100, 20));
    cbFontFamily.setOpaque(false);
    cbFontFamily.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cbFontFamilyActionPerformed(evt);
        }
    });
    jToolBar1.add(cbFontFamily);

    jToolBar2.setBackground(new java.awt.Color(255, 255, 255));
    jToolBar2.setBorder(javax.swing.BorderFactory.createTitledBorder("Allignment"));
    jToolBar2.setFloatable(false);
    jToolBar2.setRollover(true);
    jToolBar2.setMaximumSize(new java.awt.Dimension(200, 1000));
    jToolBar2.setMinimumSize(new java.awt.Dimension(200, 23));

    btnLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/left_allignment_logo1.png"))); // NOI18N
    btnLeft.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    btnLeft.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnLeft.setFocusable(false);
    btnLeft.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btnLeft.setMaximumSize(new java.awt.Dimension(30, 25));
    btnLeft.setMinimumSize(new java.awt.Dimension(23, 25));
    btnLeft.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    btnLeft.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnLeftActionPerformed(evt);
        }
    });
    jToolBar2.add(btnLeft);

    jLabel8.setText("  ");
    jToolBar2.add(jLabel8);

    btnCenter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/center_allignment_logo1.png"))); // NOI18N
    btnCenter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    btnCenter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnCenter.setFocusable(false);
    btnCenter.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btnCenter.setMaximumSize(new java.awt.Dimension(30, 25));
    btnCenter.setMinimumSize(new java.awt.Dimension(30, 25));
    btnCenter.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    btnCenter.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnCenterActionPerformed(evt);
        }
    });
    jToolBar2.add(btnCenter);

    jLabel9.setText("  ");
    jToolBar2.add(jLabel9);

    btnRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/right_allignment_logo1.png"))); // NOI18N
    btnRight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    btnRight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnRight.setFocusable(false);
    btnRight.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btnRight.setMaximumSize(new java.awt.Dimension(30, 25));
    btnRight.setMinimumSize(new java.awt.Dimension(30, 25));
    btnRight.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    btnRight.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnRightActionPerformed(evt);
        }
    });
    jToolBar2.add(btnRight);

    jToolBar3.setBackground(new java.awt.Color(255, 255, 255));
    jToolBar3.setBorder(javax.swing.BorderFactory.createTitledBorder("Coloring"));
    jToolBar3.setFloatable(false);
    jToolBar3.setRollover(true);
    jToolBar3.setMaximumSize(new java.awt.Dimension(100, 1000));
    jToolBar3.setMinimumSize(new java.awt.Dimension(100, 2));

    btnTxtColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/text_color_logo1.png"))); // NOI18N
    btnTxtColor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    btnTxtColor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnTxtColor.setFocusable(false);
    btnTxtColor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btnTxtColor.setMaximumSize(new java.awt.Dimension(30, 25));
    btnTxtColor.setMinimumSize(new java.awt.Dimension(30, 25));
    btnTxtColor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    btnTxtColor.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnTxtColorActionPerformed(evt);
        }
    });
    jToolBar3.add(btnTxtColor);

    jLabel10.setText("  ");
    jToolBar3.add(jLabel10);

    btnHighLight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/highlight_logo1.png"))); // NOI18N
    btnHighLight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    btnHighLight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnHighLight.setFocusable(false);
    btnHighLight.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btnHighLight.setMaximumSize(new java.awt.Dimension(30, 25));
    btnHighLight.setMinimumSize(new java.awt.Dimension(30, 25));
    btnHighLight.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    btnHighLight.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnHighLightActionPerformed(evt);
        }
    });
    jToolBar3.add(btnHighLight);

    jLabel1.setText("Col :");

    txtCol.setText("0");

    jLabel2.setText("Line : ");

    txtLine.setText("0");

    jLabel4.setText("Char : ");

    txtChar.setText("0");

    jLabel3.setText("Words : ");

    txtWords.setText("0");

    jMenuBar1.setOpaque(false);

    mnFile.setText("File");
    mnFile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    mnFile.setOpaque(true);

    file_open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
    file_open.setText("Open");
    file_open.setPreferredSize(new java.awt.Dimension(150, 22));
    file_open.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            file_openActionPerformed(evt);
        }
    });
    mnFile.add(file_open);

    file_save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
    file_save.setText("Save");
    file_save.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            file_saveActionPerformed(evt);
        }
    });
    mnFile.add(file_save);

    jMenuBar1.add(mnFile);

    mnEdit.setText("Edit");
    mnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    mnEdit.setOpaque(true);

    edit_copy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
    edit_copy.setText("Copy");
    edit_copy.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            edit_copyActionPerformed(evt);
        }
    });
    mnEdit.add(edit_copy);

    edit_paste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
    edit_paste.setText("Paste");
    edit_paste.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            edit_pasteActionPerformed(evt);
        }
    });
    mnEdit.add(edit_paste);

    jMenuBar1.add(mnEdit);

    setJMenuBar(jMenuBar1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtCol)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtLine)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtChar)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtWords)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jToolBar2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToolBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(txtCol)
                .addComponent(jLabel2)
                .addComponent(txtLine)
                .addComponent(jLabel4)
                .addComponent(txtChar)
                .addComponent(jLabel3)
                .addComponent(txtWords))
            .addContainerGap())
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoldActionPerformed
        // TODO add your handling code here:
        
        if(btnBold.isBorderPainted()){
            btnBold.setBorderPainted(false);
            StyleConstants.setBold(FontAttrib, true);          
        }
        else{
            btnBold.setBorderPainted(true);
            StyleConstants.setBold(FontAttrib, false);
        }
        textArea.setCharacterAttributes(FontAttrib, true);
        
    }//GEN-LAST:event_btnBoldActionPerformed

    private void file_openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file_openActionPerformed
        try {
            // TODO add your handling code here:
            controller.open();
        } catch (BadLocationException ex) {
            Logger.getLogger(MainEditor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_file_openActionPerformed

    private void btnItalicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItalicActionPerformed
        // TODO add your handling code here:
        if(btnItalic.isBorderPainted()){
            btnItalic.setBorderPainted(false);
            StyleConstants.setItalic(FontAttrib, true);          
        }
        else{
            btnItalic.setBorderPainted(true);
            StyleConstants.setItalic(FontAttrib, false);
        }
        textArea.setCharacterAttributes(FontAttrib, true); 
    }//GEN-LAST:event_btnItalicActionPerformed

    private void btnUnderlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnderlineActionPerformed
        // TODO add your handling code here:
        if(btnUnderline.isBorderPainted()){
            btnUnderline.setBorderPainted(false);
            StyleConstants.setUnderline(FontAttrib, true);          
        }
        else{
            btnUnderline.setBorderPainted(true);
            StyleConstants.setUnderline(FontAttrib, false);
        }
        textArea.setCharacterAttributes(FontAttrib, true); 
    }//GEN-LAST:event_btnUnderlineActionPerformed

    private void btnCenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCenterActionPerformed
        // TODO add your handling code here:
        btnCenter.setBorderPainted(false);
        btnLeft.setBorderPainted(true);
        btnRight.setBorderPainted(true);
        StyleConstants.setAlignment(alligmentAttrib , StyleConstants.ALIGN_CENTER);
        textArea.setParagraphAttributes(alligmentAttrib,true);
        
    }//GEN-LAST:event_btnCenterActionPerformed

    private void btnLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeftActionPerformed
        // TODO add your handling code here:
        btnCenter.setBorderPainted(true);
        btnLeft.setBorderPainted(false);
        btnRight.setBorderPainted(true);
        StyleConstants.setAlignment(alligmentAttrib , StyleConstants.ALIGN_LEFT);
        textArea.setParagraphAttributes(alligmentAttrib,true);
    }//GEN-LAST:event_btnLeftActionPerformed

    private void btnRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRightActionPerformed
        // TODO add your handling code here:
        btnCenter.setBorderPainted(true);
        btnLeft.setBorderPainted(true);
        btnRight.setBorderPainted(false);
        StyleConstants.setAlignment(alligmentAttrib, StyleConstants.ALIGN_RIGHT);
        textArea.setParagraphAttributes(alligmentAttrib,true);
    }//GEN-LAST:event_btnRightActionPerformed

    private void btnTxtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTxtColorActionPerformed
        // TODO add your handling code here:
        Color color = JColorChooser.showDialog(new JFrame(), "Select a color", Color.BLACK);
        if(color!=null){
            StyleConstants.setForeground(FontAttrib, color);
            textArea.setCharacterAttributes(FontAttrib, true);
        }
        
    }//GEN-LAST:event_btnTxtColorActionPerformed

    private void btnHighLightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHighLightActionPerformed
        // TODO add your handling code here:
        Color color = JColorChooser.showDialog(new JFrame(), "Select a color", Color.WHITE);
        if(color!=null){
            StyleConstants.setBackground(FontAttrib, color);
            textArea.setCharacterAttributes(FontAttrib, true);
        }
    }//GEN-LAST:event_btnHighLightActionPerformed

    private void cbFontSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFontSizeActionPerformed
        // TODO add your handling code here:
        StyleConstants.setFontSize(FontAttrib, Integer.valueOf(cbFontSize.getSelectedItem().toString()));
        textArea.setCharacterAttributes(FontAttrib, true);
    }//GEN-LAST:event_cbFontSizeActionPerformed

    private void cbFontFamilyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFontFamilyActionPerformed
        // TODO add your handling code here:
        StyleConstants.setFontFamily(FontAttrib, cbFontFamily.getSelectedItem().toString());
        textArea.setCharacterAttributes(FontAttrib, true);
    }//GEN-LAST:event_cbFontFamilyActionPerformed

    private void popCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popCopyActionPerformed
        // TODO add your handling code here:
        copy(textArea.getSelectedText());
    }//GEN-LAST:event_popCopyActionPerformed

    private void popPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popPasteActionPerformed
        // TODO add your handling code here:
        Document doc = textArea.getDocument();
        paste(doc);
    }//GEN-LAST:event_popPasteActionPerformed

    private void popDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popDeleteActionPerformed
        // TODO add your handling code here:
        textArea.replaceSelection("");
        
    }//GEN-LAST:event_popDeleteActionPerformed

    private void file_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file_saveActionPerformed
        try {
            // TODO add your handling code here:
            controller.save();
        } catch (BadLocationException ex) {
            Logger.getLogger(MainEditor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_file_saveActionPerformed

    private void textAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textAreaMouseClicked
        // TODO add your handling code here:
        if(evt.getButton()==MouseEvent.BUTTON3){
            popCopy.setText("Copy");
            popPaste.setText("Paste");
            popDelete.setText("Delete");
            popUpRightClick.show(this, evt.getX()+20, evt.getY()+110);
        }
    }//GEN-LAST:event_textAreaMouseClicked

    private void popCopyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_popCopyMouseClicked
        // TODO add your handling code here:
        copy(textArea.getText());
    }//GEN-LAST:event_popCopyMouseClicked

    private void popPasteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_popPasteMouseClicked
        // TODO add your handling code here:
        paste(textArea.getDocument());
    }//GEN-LAST:event_popPasteMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void textAreaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_textAreaCaretUpdate
        // TODO add your handling code here:
        int dot = evt.getDot();
        try {
            int line=controller.getLineOfOffset(textArea, dot);
            txtLine.setText(line+"");
            int positionInLine = dot - controller.getLineStartOffset(textArea, line);
            txtCol.setText(positionInLine+"");
            int charLength=textArea.getDocument().getLength();
            txtChar.setText(charLength+"");
            txtWords.setText(controller.getWordsNumber(textArea)+"");
        } catch (BadLocationException ex) {
            Logger.getLogger(MainEditor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_textAreaCaretUpdate

    private void textAreaCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_textAreaCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_textAreaCaretPositionChanged

    private void edit_copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_copyActionPerformed
        // TODO add your handling code here:
        copy(textArea.getSelectedText());
    }//GEN-LAST:event_edit_copyActionPerformed

    private void edit_pasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_pasteActionPerformed
        // TODO add your handling code here:
        paste(textArea.getDocument());
    }//GEN-LAST:event_edit_pasteActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainEditor().setVisible(true);
        });
    }
    private void copy(String selectedText){
        StringSelection data = new StringSelection(selectedText);
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        clip.setContents(data,data);
    }
    private void paste(Document doc){
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable t = clip.getContents(null);
        if(t.isDataFlavorSupported(DataFlavor.stringFlavor)){
            try {
                doc.insertString(textArea.getCaretPosition(), t.getTransferData(DataFlavor.stringFlavor).toString(),FontAttrib);
            } catch (UnsupportedFlavorException | IOException | BadLocationException ex) {
                Logger.getLogger(MainEditor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBold;
    private javax.swing.JButton btnCenter;
    private javax.swing.JButton btnHighLight;
    private javax.swing.JButton btnItalic;
    private javax.swing.JButton btnLeft;
    private javax.swing.JButton btnRight;
    private javax.swing.JButton btnTxtColor;
    private javax.swing.JButton btnUnderline;
    private javax.swing.JComboBox<String> cbFontFamily;
    private javax.swing.JComboBox<String> cbFontSize;
    private javax.swing.JMenuItem edit_copy;
    private javax.swing.JMenuItem edit_paste;
    private javax.swing.JMenuItem file_open;
    private javax.swing.JMenuItem file_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JFileChooser loadFile;
    private javax.swing.JMenu mnEdit;
    private javax.swing.JMenu mnFile;
    private javax.swing.JMenuItem popCopy;
    private javax.swing.JMenuItem popDelete;
    private javax.swing.JMenuItem popPaste;
    private javax.swing.JPopupMenu popUpRightClick;
    private javax.swing.JTextPane textArea;
    private javax.swing.JLabel txtChar;
    private javax.swing.JLabel txtCol;
    private javax.swing.JLabel txtLine;
    private javax.swing.JLabel txtWords;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnBold() {
        return btnBold;
    }

    public JButton getBtnCenter() {
        return btnCenter;
    }

    public JButton getBtnHighLight() {
        return btnHighLight;
    }

    public JButton getBtnItalic() {
        return btnItalic;
    }

    public JButton getBtnRight() {
        return btnRight;
    }

    public JButton getBtnTxtColor() {
        return btnTxtColor;
    }

    public JButton getBtnUnderline() {
        return btnUnderline;
    }

    public JMenuItem getEdit_copy() {
        return edit_copy;
    }

    public JMenuItem getEdit_paste() {
        return edit_paste;
    }

    public JMenuItem getFile_open() {
        return file_open;
    }

    public JMenuItem getFile_save() {
        return file_save;
    }

    public JMenu getMnEdit() {
        return mnEdit;
    }

    public JMenu getMnFile() {
        return mnFile;
    }

    public JMenuItem getPopCopy() {
        return popCopy;
    }

    public JMenuItem getPopDelete() {
        return popDelete;
    }

    public JMenuItem getPopPaste() {
        return popPaste;
    }

    public JPopupMenu getPopUpRighClick() {
        return popUpRightClick;
    }

    public JTextPane getTextArea() {
        return textArea;
    }

    public JFileChooser getLoadFile() {
        return loadFile;
    }

    public JLabel getTxtChar() {
        return txtChar;
    }

    public JLabel getTxtCol() {
        return txtCol;
    }
}
