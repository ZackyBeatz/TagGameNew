
package tagver3.ItemsFactories;
/**
 *
 * @author BenedikteEva
 */
public class PrettyDollsFactory  {

   public PrettyDolls[] doll() {
       
            PrettyDolls[] doll = new PrettyDolls[5];
     

        doll[0] = new PrettyDolls("Wanda", "You look at a doll with beautiful"
                + " saphires as eyes.\n You pause for a moment and take a deep breath", 3);

        doll[1] = new PrettyDolls("Jubilee", "This doll with emeralds as eyes, ruby lips "
                + " and golden skin tone,\n reminds you somehow of a girl you once played with "
                + " as a kid.\n You smile softly at the memory", 4);

        doll[2] = new PrettyDolls("Quanty", "Diamond eyes, snowywhite skin and hair,\n "
                + "and slender body, this etheral doll looks like an angel.\n A feeling of great calm"
                + " rushes through you\n as you admire the slender doll", 5);

        doll[3] = new PrettyDolls("Ophelia", "With her sad black opal eyes and curly wild hair,\n and beautyful figure"
                + " this gypsy queen makes you stop\n and stare and breathe deeply", 6);

        doll[4] = new PrettyDolls("Potsy", "Not exactly pretty, but with his roundness,\n blue bulging eyes "
                + " and big smile, he makes you laugh,\n which was exactly what you needed to make your day", 7);

    


        return doll;

    }


    }


