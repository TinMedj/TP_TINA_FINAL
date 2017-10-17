import java.util.Vector;

/**
 * Created by HP on 17/10/2017.
 */
public class VectorHelper {

    /**
     * methode pour initialiser des vectuers
     * @param v : vecteur que l'on veut initialiser
     * @param taille nombre d'element que l'on veut creer
     */
    public static void creer_vector(Vector<Integer> v , int taille)
    {

        for(int i=0; i<taille;i++) {
            v.addElement(3+(int)(Math.random()* 200)  );
            System.out.print(v.elementAt(i));
        }
        //System.out.print("votre vecteur est mis à jour ");
    }

    //il faut que je change ceci pour montrer un conflit
    /**
     * methode pour afficher le contenu d'un veceur
     * @param v vecteur dont on veu voir les elements
     */
    public static void afficher_vector(Vector<Integer> v)
    {
        System.out.print("\n voici les elements de votre vecteur :");
        for (int i=0;i<v.size();i++)
        {
            System.out.print(v.elementAt(i)+" | ");
        }
    }


    /**
     * Cette methode permet d'inverser un tableau
     * @param v le vector à inverser
     */
    public static void inverser_vector(Vector<Integer> v)
    {
        int taille_vector = v.size()-1 ;
        int k=0;
        while(k<taille_vector)
        {
            int element = v.elementAt(taille_vector);
            v.set(taille_vector,v.elementAt(k));
            v.set(k,element);
            k++;
            taille_vector--;
        }

        System.out.print("\n \n votre vecteur a bien été inversé ");

    }

    /**
     * methode pour trier un vecteur par la methode à bulle
     * @param v vecteur à trier
     */
    public static void trier_vector(Vector<Integer> v)
    {
        int  n  =  v.size() - 1 ;
        for (  int  i  =  n ;  i >= 0 ;  i -- )
            for (  int  j  =  1 ;  j <= i ;  j ++ )
                if ( v.elementAt(j-1)  >  v.elementAt(j) )
                {
                    int  temp  =  v.elementAt(j-1) ;
                    v.set(j-1,v.elementAt(j))   ;
                    v.set(j,temp) ;
                }
    }

    /**
     * methode pour sommer deux vecteurs
     * @param v1 premier vecteur à sommer
     * @param v2 deuxieme vecteur à sommer
     * @param v3 vecteur resultant de la somme de v1 et v2
     * @throws sizeException exception qui gere la difference des tailles entre v1 et v2
     */
    public static void somme2Vector (Vector<Integer> v1,Vector<Integer> v2,Vector<Integer> v3) throws sizeException
    {
        if(v1.size()!= v2.size()) throw new sizeException();
        else {
            for (int i=0;i<v1.size();i++)
            {
                v3.addElement(v1.elementAt(i)+v2.elementAt(i));
            }
        }

    }

    /**
     * renvoir un vecteur qui contient le min et le max (min-max)
     * @param v le vecteur sur lequel on doit faire le traitement
     * @param output vecteur qui contient le min (0) et le max (1)
     */
    public static void min_max(Vector<Integer> v, Vector<Integer> output )

    {
        int max=0; int min;
        min=v.elementAt(0);
        for(int i=0;i<v.size();i++){
            if (v.elementAt(i)>max)max=v.elementAt(i);
            if (v.elementAt(i)<min)min=v.elementAt(i);
        }
        output.addElement(min);
        output.addElement(max);

    }

    /**
     * formule qui calcule le carré des elements du vecteur
     * @param v vecteur dont les elements seront traités
     */
    public static void formule(Vector<Integer> v)
    {
        //la formule permet de calculer le carré des element du vecteur
        for (int i=0;i<v.size();i++)
        {
            v.set(i,v.elementAt(i)*v.elementAt(i));
        }

    }



}
