/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import com.formdev.flatlaf.FlatIntelliJLaf;
import compilerTools.CodeBlock;
import compilerTools.Directory;
import compilerTools.ErrorLSSL;
import compilerTools.Functions;
import compilerTools.Grammar;
import compilerTools.Production;
import compilerTools.TextColor;
import compilerTools.Token;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Martin Puga
 */
public class CompiladorMartin extends javax.swing.JFrame {

    private String title;
    private Directory Directorio;
    private ArrayList<Token> tokens;
    private ArrayList<ErrorLSSL> errors;
    private ArrayList<TextColor> textsColor;
    private Timer timerKeyReleased;
    private ArrayList<Production> identProd;
    private HashMap<String, String> identificadores;
    private boolean codeHasBeenCompiled = false;
    
    
    /**
     * Creates new form CompiladorMartin
     */
    public CompiladorMartin() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNuevo = new javax.swing.JButton();
        btnAbrir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnGuardarC = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTokens = new javax.swing.JTable();
        btnEjecutar = new javax.swing.JButton();
        btnCompilar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtaOutputConsole = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtpCode = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnAbrir.setText("Abrir");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnGuardarC.setText("Guardar como");
        btnGuardarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCActionPerformed(evt);
            }
        });

        tblTokens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Componente l??xico", "Lexema", "[L??nea, Columna]"
            }
        ));
        jScrollPane2.setViewportView(tblTokens);
        if (tblTokens.getColumnModel().getColumnCount() > 0) {
            tblTokens.getColumnModel().getColumn(0).setResizable(false);
        }

        btnEjecutar.setText("Ejecutar");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });

        btnCompilar.setText("Compilar");
        btnCompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompilarActionPerformed(evt);
            }
        });

        jtaOutputConsole.setColumns(20);
        jtaOutputConsole.setRows(5);
        jScrollPane3.setViewportView(jtaOutputConsole);

        jScrollPane4.setViewportView(jtpCode);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAbrir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGuardarC)
                                .addGap(73, 73, 73)
                                .addComponent(btnCompilar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEjecutar))
                            .addComponent(jScrollPane3)))
                    .addComponent(jScrollPane4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevo)
                            .addComponent(btnAbrir)
                            .addComponent(btnGuardar)
                            .addComponent(btnGuardarC)
                            .addComponent(btnEjecutar)
                            .addComponent(btnCompilar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        Directorio.New();
        clearFields();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        if(Directorio.Open()){
            colorAnalysis();
            clearFields();
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(Directorio.Save()){
            clearFields();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompilarActionPerformed
        if(getTitle().contains("*") || getTitle().equals(title)){
            if(Directorio.Save()){
                compile();
            }
        }
        else{
            compile();
        }
    }//GEN-LAST:event_btnCompilarActionPerformed

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        btnCompilar.doClick();
        if(codeHasBeenCompiled){
            if(!errors.isEmpty()){
                JOptionPane.showMessageDialog(null, "No se puede ejecutar el c??digo ya que se encontr?? uno o m??s errores");
            }
            else{
                CodeBlock codeBlock = Functions.splitCodeInCodeBlocks(tokens, "{", "}", ";");
                ArrayList<String> blocksOfCode = codeBlock.getBlocksOfCodeInOrderOfExec();
                System.out.println(blocksOfCode);
                executeCode(blocksOfCode, 1);
            }
        }
    }//GEN-LAST:event_btnEjecutarActionPerformed
    private void executeCode(ArrayList<String> blocksOfCode, int repeats){
        for(int j=1; j<=repeats; j++){
            int repeatCode = -1;
            for(int i=0; i<blocksOfCode.size(); i++){
                String blockOfCode = blocksOfCode.get(i);
                if(repeatCode!=-1){
                    int[] posicionMarcador = CodeBlock.getPositionOfBothMarkers(blocksOfCode, blockOfCode);
                    executeCode(new ArrayList<>(blocksOfCode.subList(posicionMarcador[0], posicionMarcador[1])),repeatCode );
                    repeatCode = -1;
                    i = posicionMarcador[1];
                }
                else{
                    String[] sentences = blockOfCode.split(";");
                    for(String sentence : sentences){
                        sentence = sentence.trim();
                        if(sentence.startsWith("pintar")){
                            String parametro;
                            if(sentence.contains("$")){
                                parametro = identificadores.get(sentence.substring(9,sentence.length()-2));
                            }
                            else{
                                parametro = sentence.substring(9,sentence.length()-2);
                            }
                            System.out.println("Pintando de color "+ parametro + "...");
                        }
                        else if(sentence.startsWith("izquierda")){
                            System.out.println("Moviendose a la izquierda...");
                            
                        }
                        else if(sentence.startsWith("derecha")){
                            System.out.println("Moviendose a la derecha...");
                            
                        }
                        else if(sentence.startsWith("adelante")){
                            System.out.println("Moviendose hacia adelante...");
                            
                        }
                        else if(sentence.contains("-->")){
                            System.out.println("Declarando identificador...");
                        
                        }
                        else if(sentence.startsWith("atr??s")){
                            System.out.println("Moviendose hacia atr??s..");
                            
                        }
                        else if(sentence.startsWith("repetir")){
                            String parametro;
                            if(sentence.contains("$")){
                                parametro = identificadores.get(sentence.substring(10, sentence.length()-2));
                            }
                            else{
                                parametro = sentence.substring(10, sentence.length()-2);
                            }
                            repeatCode = Integer.parseInt(parametro);
                        }
                    }
                }
            }
        }
    }
    
    private void btnGuardarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCActionPerformed
        if(Directorio.SaveAs()){
            clearFields();
        }
    }//GEN-LAST:event_btnGuardarCActionPerformed
    
    private void init(){
        title = "MartinCompilador";
        setLocationRelativeTo(null);
        setTitle(title);
        Directorio = new Directory(this, jtpCode, title, ".cd");
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
             Directorio.Exit();
             System.exit(0);
            }
        });
        Functions.setLineNumberOnJTextComponent(jtpCode);
        timerKeyReleased = new Timer(300, ((e) -> {
            timerKeyReleased.stop(); 
            int posicion = jtpCode.getCaretPosition();
            jtpCode.setText(jtpCode.getText().replaceAll("[\r]+", ""));
            jtpCode.setCaretPosition(posicion);
            colorAnalysis();
        }));
        Functions.insertAsteriskInName(this, jtpCode, ()->{
            timerKeyReleased.restart();
        });
        tokens = new ArrayList<>();
        errors = new ArrayList<>();
        textsColor = new ArrayList<>();
        identProd = new ArrayList<>();
        identificadores = new HashMap<>();
        Functions.setAutocompleterJTextComponent(new String[]{"color", "n??mero", "este",
        "oeste", "sur", "norte", "pintar"}, jtpCode, ()->{
            timerKeyReleased.restart();
        });
    }
    private void colorAnalysis(){
        textsColor.clear();
        LexerColor lexer;
        
        try {
                    File codigo = new File("color.encrypter");
            FileOutputStream output = new FileOutputStream(codigo);
                    byte[] bytesText = jtpCode.getText().getBytes();
                    output.write(bytesText);
                    BufferedReader entrada = new BufferedReader(new InputStreamReader(new FileInputStream(codigo), "UTF-8"));
                    lexer = new LexerColor(entrada);
                    while(true){
                        TextColor textColor = lexer.yylex();
                        if(textColor == null){
                           break;
                        }
                        textsColor.add(textColor);
                    }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CompiladorMartin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CompiladorMartin.class.getName()).log(Level.SEVERE, null, ex);
        }
        Functions.colorTextPane(textsColor, jtpCode, new Color(40,40,40));
    }
    
    private void clearFields(){
        Functions.clearDataInTable(tblTokens);
        jtaOutputConsole.setText("");
        tokens.clear();
        errors.clear();
        identProd.clear();
        identificadores.clear();
        codeHasBeenCompiled = false;
    }
    
    private void compile(){
        clearFields();
        lexicalAnalysis();
        fillTableTokens();
        syntacticAnalysis();
        semanticAnalysis(); 
        printConsole();
        codeHasBeenCompiled = true;
    }
    
    private void lexicalAnalysis(){
        Lexer lexer;
        
        try {
                    File codigo = new File("code.encrypter");
            FileOutputStream output = new FileOutputStream(codigo);
                    byte[] bytesText = jtpCode.getText().getBytes();
                    output.write(bytesText);
                    BufferedReader entrada = new BufferedReader(new InputStreamReader(new FileInputStream(codigo), "UTF-8"));
                    lexer = new Lexer(entrada);
                    while(true){
                        Token token = lexer.yylex();
                        if(token == null){
                           break;
                        }
                        tokens.add(token);
                    }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CompiladorMartin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CompiladorMartin.class.getName()).log(Level.SEVERE, null, ex);
        } 

    }
    
    private void fillTableTokens(){
        tokens.forEach(token->{
            Object[] data = new Object[]{token.getLexicalComp(), token.getLexeme(),
            "["+token.getLine()+", "+token.getColumn()+"]"};
            Functions.addRowDataInTable(tblTokens, data);
        });
    }
    
    private void syntacticAnalysis(){
        Grammar gramatica = new Grammar(tokens, errors);
        
        /* Eliminaci??n de errores */
        gramatica.delete(new String[]{"ERROR", "ERROR_1", "ERROR_2"}, 1);
        
        /* Agrupaci??n de valores */
        gramatica.group("VALOR", "(NUMERO | COLOR)", true);
        
        /* Declaraci??n de variables */
        gramatica.group("VARIABLE", "TIPO_DATO IDENTIFICADOR OP_ASIG VALOR", true, identProd);
        gramatica.group("VARIABLE", "TIPO_DATO OP_ASIG VALOR", true,
                2, "error sint??ctico {}: falta el identificador en la variable [#, %]");
        
        gramatica.group("VARIABLE", "IDENTIFICADOR OP_ASIG VALOR", true,
                3, "error sint??ctico {}: falta el tipo de dato en la variable [#, %]");
        
        gramatica.group("VARIABLE", "TIPO_DATO IDENTIFICADOR VALOR", true,
                4, "error sint??ctico {}: falta el operador de asignaci??n en la variable [#, %]");
        
         gramatica.group("VARIABLE", "TIPO_DATO IDENTIFICADOR OP_ASIG", true,
                5, "error sint??ctico {}: falta el valor de asignaci??n en la variable [#, %]");
        
        gramatica.finalLineColumn();    
        gramatica.group("VARIABLE", "TIPO_DATO IDENTIFICADOR OP_ASIG", 6,
                "error sint??ctico {}: falta el valor en la declaraci??n [#, %]");
        
        gramatica.initialLineColumn();
        
        /* Eliminaci??n de tipos de dato y operadores de asignaci??n */
        gramatica.delete("TIPO_DATO", 7,
                "Error sint??ctico {}: el tipo de dato no est?? en una declaraci??n [#, %]");
        
        gramatica.delete("OP_ASIG", 8,
                "Error sint??ctico {}: el operador de asignaci??n no esta en una declaraci??n [#, %]");
        
        /* Agrupar de identificadores y definici??n de par??metros */
        gramatica.group("VALOR", "IDENTIFICADOR", true);
        gramatica.group("PARAMETROS", "VALOR (COMA VALOR)+");
        
        /* Agrupaci??n de funciones */
        gramatica.group("FUNCION", "(MOVIMIENTO | PINTAR | DETENER_PINTAR | TOMAR |"+
                "LANZAR_MONEDA | VER | DETENER_REPETIR)", true);
        gramatica.group("FUNCION_COMP", "FUNCION PARENTESIS_A (VALOR | PARAMETROS)? PARENTESIS_C", true);
        gramatica.group("FUNCION_COMP", "FUNCION (VALOR | PARAMETROS)? PARENTESIS_C", true,     
                9, "error sint??ctico {}: falta el par??ntesis que abre en la funci??n [#, %]");
        gramatica.finalLineColumn();
        
        gramatica.group("FUNCION_COMP", "FUNCION PARENTESIS_A (VALOR | PARAMETROS)", true,     
                10, "error sint??ctico {}: falta el par??ntesis que abre en la funci??n [#, %]");
        
        gramatica.initialLineColumn();
        
        /* Eliminaci??n de funciones incompletas */
        gramatica.delete("FUNCION", 11, "error sint??ctico {}: la funci??n no esta declarada correctamente");
        
        gramatica.loopForFunExecUntilChangeNotDetected(()->{
        gramatica.group("EXP_LOGICA", "(FUNCION_COMP | EXP_LOGICA) (OP_LOGICO (FUNCION_COMP | EXP_LOGICA))+");
        gramatica.group("EXP_LOGICA", "PARENTESIS_A  (EXP_LOGICA | FUNCION_COMP) PARENTESIS_C");
        });
        
        /* Eliminaci??n de operadores l??gicos */
        gramatica.delete("OP_LOGICO", 12,
                "error sint??ctico {}: el operador l??gico no esta contenido en una expresi??n");
        
        /* agrupaci??n de expresiones l??gicas como valor y par??metros */
        gramatica.group("VALOR", "EXP_LOGICA");
        gramatica.group("PARAMETROS", "VALOR (COMA VALOR)+");
        
        /* AGRUPACI??N DE ESTRUCTURAS DE CONTROL */
        gramatica.group("EST_CONTROL", "(REPETIR | ESTRUCTURA_SI)");
        gramatica.group("EST_CONTROL_COMP", "EST_CONTROL PARENTESIS_A PARENTESIS_C");
        gramatica.group("EST_CONTROL_COMP","EST_CONTROL (VALOR | PARAMETROS)");
        gramatica.group("EST_CONTROL_COMP", "EST_CONTROL PARENTESIS_A (VALOR | PARAMETROS) PARENTESIS_C"); 
        
        /* ELIMINACI??N DE ESTRUCTURAS DE CONTROL INCOMPLETAS */
        gramatica.delete("EST_CONTROL", 13,
                "error sint??ctico {}: la estructura de control no esta declarada correctamente [#, %]");
        
        /* Eliminaci??n de parentesis */
        gramatica.delete(new String[]{"PARENTESIS_A", "PARENTESIS_C"}, 14,
        "error sint??ctico {}: el par??ntesis [] no est?? contenido en una agrupaci??n [#, %]");
        
        gramatica.finalLineColumn();
        /* Verificaci??n de punto y coma al final de una sentencia */
        // Identificadores o variables
        gramatica.group("VARIABLE_PC", "VARIABLE PUNTO_COMA", true);
        gramatica.group("VARIABLE_PC", "VARIABLE", true,
                15, "error sint??ctico {}: falta el punto y coma al final de la variable [#, %]");
        
        //Funciones
        gramatica.group("FUNCION_COMP_PC", "FUNCION_COMP PUNTO_COMA");
        gramatica.group("FUNCION_COMP_PC", "FUNCION_COMP", 16,
                "error sint??ctico {} : falta el punto y coma al final de la declaraci??n de la funci??n [#, %]");
        
        gramatica.initialLineColumn();
        
        /* Eliminaci??n el punto y coma */
        gramatica.delete("PUNTO_COMA", 17, 
                "error sint??ctico {}: el punto y coma no est?? al final de una sentencia [#, %]");
        
        /* Sentencias */
        gramatica.group("SENTENCIAS", "(VARIABLE_PC | FUNCION_COMP_PC)+");
        
        gramatica.loopForFunExecUntilChangeNotDetected(()->{
            gramatica.group("EST_CONTROL_COMP_LASLC", "EST_CONTROL_COMP LLAVE_A (SENTENCIAS)? LLAVE_C", true);
            gramatica.group("SENTENCIAS", "(SENTENCIAS | EST_CONTROL_COMP_LASLC)+");
        });
        
        /* Estructuras de funci??n incompletas */
        gramatica.loopForFunExecUntilChangeNotDetected(()->{
            gramatica.initialLineColumn();
            
            gramatica.group("EST_CONTROL_COMP_LASLC", "EST_CONTROL_COMP (SENTENCIAS)? LLAVE_C", true, 
                    18, "error sint??ctico {}: falta la llave que abre en la estructura de control");
            
            gramatica.finalLineColumn();
            
            gramatica.group("EST_CONTROL_COMP_LASLC", "EST_CONTROL_COMP LLAVE_A SENTENCIAS", true, 
                    19, "error sint??ctico {}: falta la llave que cierra en la estructura de control");
            
            gramatica.group("SENTENCIAS", "(SENTENCIAS | EST_CONTROL_COMP_LASLC)");
            
        });
                
        gramatica.delete(new String[]{"LLAVE_A", "LLAVE_C"}, 20,
                "error sint??ctico {}: la llave [] no est?? contenida en una agrupaci??n [#, %]");
        gramatica.show();
    }
    private void semanticAnalysis(){
        HashMap<String, String> identDataType = new HashMap<>();
        identDataType.put("color", "COLOR");
        identDataType.put("n??mero", "NUMERO");
        for(Production id: identProd){
            if(!identDataType.get(id.lexemeRank(0)).equals(id.lexicalCompRank(-1))){
                errors.add(new ErrorLSSL(1, "error sem??ntico {}: valor no compatible con el tipo de dato [#, %]", id, true));
            }
            else if(id.lexicalCompRank(-1).equals("COLOR") && !id.lexemeRank(-1).matches("#[0-9a-fA-F]+")){
                errors.add(new ErrorLSSL(2, "error sem??ntico {}: el color no es un n??mero hexadecimal [#, %]", id, false));
            }
            else{
                identificadores.put(id.lexemeRank(1), id.lexemeRank(-1));
            }
        }
    }
    
    private void printConsole(){
        int sizeErrors = errors.size();
        if(sizeErrors > 0){
            Functions.sortErrorsByLineAndColumn(errors);
            String strErrors = "\n";
            for(ErrorLSSL error: errors){
                String strError = String.valueOf(error);
                strErrors += strError + "\n";
            }
            jtaOutputConsole.setText("Compilaci??n terminada...\n"+strErrors+"\nLa compilaci??n termin?? con errores");
        }
        else {
            jtaOutputConsole.setText("Compilaci??n terminada...");
        }
    }
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
            java.util.logging.Logger.getLogger(CompiladorMartin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompiladorMartin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompiladorMartin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompiladorMartin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(new FlatIntelliJLaf());
                
                new CompiladorMartin().setVisible(true);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(CompiladorMartin.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnCompilar;
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarC;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jtaOutputConsole;
    private javax.swing.JTextPane jtpCode;
    private javax.swing.JTable tblTokens;
    // End of variables declaration//GEN-END:variables
}
