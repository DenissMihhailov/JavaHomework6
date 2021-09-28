/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahomework6;

/**public char[] toCharArray()
 *
 * @author krasa
 */
public class JavaHomework6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String text="Съешь ещё этих французских булок и галет, да выпей же чаю с молоком, как и я.";
        char[] textLetter = text.toCharArray();
        
        for (int i = 0; i < textLetter.length; i++) {
            System.out.println("Element [" + i + "]: " + textLetter[i]);

            
        }
    }
    
}
