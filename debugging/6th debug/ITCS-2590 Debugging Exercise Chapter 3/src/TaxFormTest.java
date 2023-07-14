/*
 * This is the MAIN class; RUN this class to show
 * that the TaxForm.java program functions correctly.
 *
 * NOTE: You must first debug the TaxForm.java file.
 *       There is no need to debug this file.
 */
public class TaxFormTest {

    public static void main(String[] args)
    {
        TaxForm michiganStateTaxForm = new TaxForm();
        
        michiganStateTaxForm.setTaxRate(.07);
        System.out.println("Tax Form Rate: " + michiganStateTaxForm.getTaxRate());

        michiganStateTaxForm.setTaxRate(.09);
        System.out.println("Tax Form Rate: " + michiganStateTaxForm.getTaxRate());
    }
}
