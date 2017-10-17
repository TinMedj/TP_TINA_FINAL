import java.util.Vector;

/**
 * Created by HP on 17/10/2017.
 */
public class main {
    public static void main(String[] args) {


        Vector<Integer> vec1=new Vector<Integer>();
        Vector<Integer> vec2=new Vector<Integer>();
        Vector<Integer> vec3=new Vector<Integer>();
        Vector<Integer> min_max=new Vector<Integer>();
        System.out.print("initialisation du vecteur01");
        //teste conflit
        VectorHelper.creer_vector(vec1,5);
        System.out.print("\n affichage du contenu du vecteur01 ");
        VectorHelper.afficher_vector(vec1);
        VectorHelper.inverser_vector(vec1);
        System.out.print("\n inversion du vecteur 01 :");
        VectorHelper.afficher_vector(vec1);
        System.out.print("\n Trier le vecteur01 ");
        VectorHelper.trier_vector(vec1);
        VectorHelper.afficher_vector(vec1);
        System.out.print("\n min et max du vecteur01: ");
        VectorHelper.min_max(vec1,min_max);
        System.out.print("\n le min est : "+min_max.elementAt(0)+" \n le max est : "+min_max.elementAt(1));
        System.out.print("\n application de la formule pour le vecteur01:  ");
        VectorHelper.formule(vec1);
        VectorHelper.afficher_vector(vec1);
        System.out.print("initialisation du vecteur02");
        VectorHelper.creer_vector(vec2,5);
        System.out.print("\n affichage du contenu du vecteur02 ");
        VectorHelper.afficher_vector(vec2);
        System.out.print("\n somme des deux vecteurs : ");
        try {
            VectorHelper.somme2Vector(vec1,vec2,vec3);
        } catch (sizeException e) {
            System.out.print("vos deux vecteurs n'ont pas la meme taille ");
        }
        VectorHelper.afficher_vector(vec3);



    }

}
