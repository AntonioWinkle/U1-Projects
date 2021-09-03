import javax.swing.JOptionPane;
public class RPGCharacter {
    public static void main(String[] args) {
        int strStat, mindStat, nimbleStat, soulStat, levelMan;
        String dumbHolder;

        dumbHolder = JOptionPane.showInputDialog("Enter your level: ");
        levelMan = Integer.parseInt(dumbHolder);
        dumbHolder = JOptionPane.showInputDialog("Enter your strength stat: ");
        strStat = Integer.parseInt(dumbHolder);
        dumbHolder = JOptionPane.showInputDialog("Enter your mind stat:");
        mindStat = Integer.parseInt(dumbHolder);
        dumbHolder = JOptionPane.showInputDialog("Enter your nimble stat: ");
        nimbleStat = Integer.parseInt(dumbHolder);
        dumbHolder = JOptionPane.showInputDialog("Enter your soul stat: ");
        soulStat = Integer.parseInt(dumbHolder);


        int damageOutput = strStat + nimbleStat * mindStat * levelMan;
        int defenseProtec = strStat + mindStat * levelMan;
        int spellOutput = mindStat * soulStat * 2 * levelMan;
        int manaPool = soulStat * 4 * levelMan;

        JOptionPane.showMessageDialog(null, "Your level is " + levelMan);
        JOptionPane.showMessageDialog(null, "Your damage output is " + damageOutput);
        JOptionPane.showMessageDialog(null, "Your defense is " + defenseProtec);
        JOptionPane.showMessageDialog(null, "Your spell's damage out put is " + spellOutput);
        JOptionPane.showMessageDialog(null, "Your mana pool is " + manaPool);
    }
    /*Create a program that calculates an RPG Character's battle stats based on the character's physical stats.
    The physical and battle stat can be anything you wish provided it meets these criteria:

        The physical stats (Strength, Dexterity, Spirit etc ...) will be entered by the user
        The battle stats (damage, armor, mana capacity, spell strength ...) will be calculated based on the physical stats.

     We will continue to expand on this program throughout the year, so give it some thought. There should be some complexity.

     The program should run using dialog boxes and the output should show ALL the character's stats including a name.
     */
}
