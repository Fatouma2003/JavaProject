import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Equipe {
    private String nom;
    private List<Joueur> joueurs;

    public Equipe(String nom, List<Joueur> joueurs) {
        this.nom = nom;
        this.joueurs = joueurs;
    }

    public String getNom() {
        return nom;
    }

    public List<Joueur> getJoueurs() {
        return joueurs;
    }

    public Joueur trouverJoueur(String nomJoueur) {
        for (Joueur joueur : joueurs) {
            if (joueur.getNom().equalsIgnoreCase(nomJoueur)) {
                return joueur;
            }
        }
        return null;
    }
     //Méthode pour ajouter un joueur à l'équipe
    public void ajouterJoueur(Joueur joueur) {
        joueurs.add(joueur);
    }

}
 class Joueur {
    private String nom;
    private int maillot;
    private String position;
    private Equipe equipe;

    public Joueur(String nom, int maillot, String position, Equipe equipe) {
        this.nom = nom;
        this.maillot = maillot;
        this.position = position;
        this.equipe = equipe;
    }

    public String getNom() {
        return nom;
    }

    public int getMaillot() {
        return maillot;
    }

    public String getPosition() {
        return position;
    }

    public Equipe getEquipe() {
        return equipe;
    }
}
class Match {
    private Equipe equipe1;
    private Equipe equipe2;
    private int scoreEquipe1;
    private int scoreEquipe2;

    public Match(Equipe equipe1, Equipe equipe2, int scoreEquipe1, int scoreEquipe2) {
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
        this.scoreEquipe1 = scoreEquipe1;
        this.scoreEquipe2 = scoreEquipe2;
    }

    public Equipe getEquipe1() {
        return equipe1;
    }

    public Equipe getEquipe2() {
        return equipe2;
    }

    public int getScoreEquipe1() {
        return scoreEquipe1;
    }

    public int getScoreEquipe2() {
        return scoreEquipe2;
    }

    public Equipe trouverEquipe(String nomEquipe, List<Equipe> listeEquipes) {
        for (Equipe equipe : listeEquipes) {
            if (equipe.getNom().equalsIgnoreCase(nomEquipe)) {
                return equipe;
            }
        }
        return null;
    }
}

class Classement {
   public static void ordreClassement(){
    System.out.println("Le classement de coupe du monde Qatar 2022 est le suivant:\n1:Argentine\n2:France\n3:Croatie");
   }
}

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Listes pour stocker les données
        List<Equipe> equipes = new ArrayList<>();
        List<Joueur> joueurs = new ArrayList<>();
        List<Match> matches = new ArrayList<>();
        // Insérer les équipes
        Equipe equipe1 = new Equipe("FRANCE", new ArrayList<>());
        Equipe equipe2 = new Equipe("Maroc", new ArrayList<>());
        Equipe equipe3 = new Equipe("Argentine", new ArrayList<>());
        Equipe equipe4 = new Equipe("Angleterre", new ArrayList<>());
        Equipe equipe5 = new Equipe("Pays Bas", new ArrayList<>());
        Equipe equipe6 = new Equipe("Croitie", new ArrayList<>());
        Equipe equipe7 = new Equipe("Portugal", new ArrayList<>());
        Equipe equipe8 = new Equipe("Bresil", new ArrayList<>());
        equipes.add(equipe1);
        equipes.add(equipe2);
        equipes.add(equipe3);
        equipes.add(equipe4);
        equipes.add(equipe5);
        equipes.add(equipe6);
        equipes.add(equipe7);
        equipes.add(equipe8);
        // Insérer les joueurs
          Joueur joueur206 = new Joueur("Deschamps",0, "ANT", equipe1);
        Joueur joueur1 = new Joueur("Jonathan Clauss", 1, "GB", equipe1);
        Joueur joueur2 = new Joueur(" Brice Samba", 2, "DEF", equipe1);
        Joueur joueur3= new Joueur("Benjamin Pavard", 3, "DEF", equipe1);
        Joueur joueur4 = new Joueur("Axel Disasi", 4, "MIL", equipe1);
        Joueur joueur5 = new Joueur("Raphaël Varane", 5, "DEF",equipe1);
        Joueur joueur6 = new Joueur("Dayot Upamecano", 6, "DEF", equipe1);
        Joueur joueur7 = new Joueur("Jules Koundé", 7, "ATT",equipe1);
        Joueur joueur8 = new Joueur("Matteo Guendouz", 8, "MIL", equipe1);
         Joueur joueur9 = new Joueur("Youssouf Fofana", 9, "ATT", equipe1);
        Joueur joueur10 = new Joueur("Antoine Griezmann", 10, "MIL",equipe1);
         Joueur joueur11 = new Joueur("Aurélien Tchouaméni ", 11, "MIL",equipe1);
         Joueur joueur12 = new Joueur("Olivier Giroud", 12, "GB", equipe1);
        Joueur joueur13 = new Joueur("Kylian Mbappé", 13, "ATT",equipe1);
         Joueur joueur14 = new Joueur(" Ousmane Dembélé", 14, "ATT", equipe1);
          Joueur joueur15 = new Joueur(" Randal Kolo Muani ", 15, "MIL",equipe1);
         Joueur joueur16 = new Joueur(" Ibrahima Konaté ", 16, "ATT", equipe1);
         Joueur joueur17 = new Joueur(" Adrien Rabiot", 17, "ATT", equipe1);
          Joueur joueur18 = new Joueur("Boubacar Kamara", 18, "DEF", equipe1);
        Joueur joueur19 = new Joueur("Marcus Thuram ", 19, "ATT",equipe1);
        Joueur joueur20 = new Joueur("Steve Mandanda", 20, "DEF", equipe1);
         Joueur joueur21 = new Joueur("Mike Maignan ", 21, "ATT", equipe1);
       Joueur joueur22 = new Joueur("William Saliba", 22, "GB", equipe1);
      Joueur joueur23 = new Joueur("Wesley Fofana", 23, "MIL", equipe1);
        Joueur joueur24 = new Joueur("Christopher Nkunku", 24, "DEF", equipe1);
        Joueur joueur25 = new Joueur("Jordan Veretout", 25, "DEF", equipe1);
        Joueur joueur26 = new Joueur("Kingsley Coman (", 26, "MIL", equipe1);
         joueurs.add(joueur206);
        joueurs.add(joueur1);
        joueurs.add(joueur2);
        joueurs.add(joueur3);
        joueurs.add(joueur4);
joueurs.add(joueur5);
joueurs.add(joueur6);
joueurs.add(joueur7);
joueurs.add(joueur8);
joueurs.add(joueur9);
joueurs.add(joueur10);
joueurs.add(joueur11);
joueurs.add(joueur12);
joueurs.add(joueur13);
joueurs.add(joueur14);
joueurs.add(joueur15);
joueurs.add(joueur16);
joueurs.add(joueur17);
joueurs.add(joueur18);
joueurs.add(joueur19);
joueurs.add(joueur20);
joueurs.add(joueur21);
joueurs.add(joueur22);
joueurs.add(joueur23);       
joueurs.add(joueur24);
joueurs.add(joueur25);
joueurs.add(joueur26);
        equipe1.ajouterJoueur(joueur206);
        equipe1.ajouterJoueur(joueur2);
        equipe1.ajouterJoueur(joueur3);
        equipe1.ajouterJoueur(joueur4);
 equipe1.ajouterJoueur(joueur5);
 equipe1.ajouterJoueur(joueur6);
 equipe1.ajouterJoueur(joueur7);
 equipe1.ajouterJoueur(joueur8);
 equipe1.ajouterJoueur(joueur9);
 equipe1.ajouterJoueur(joueur10);
 equipe1.ajouterJoueur(joueur11);
 equipe1.ajouterJoueur(joueur12);
 equipe1.ajouterJoueur(joueur13);
 equipe1.ajouterJoueur(joueur14);
 equipe1.ajouterJoueur(joueur15);
 equipe1.ajouterJoueur(joueur16);
 equipe1.ajouterJoueur(joueur17);
 equipe1.ajouterJoueur(joueur18);
 equipe1.ajouterJoueur(joueur19);
 equipe1.ajouterJoueur(joueur20);

 equipe1.ajouterJoueur(joueur21);
 equipe1.ajouterJoueur(joueur22);
 equipe1.ajouterJoueur(joueur23);       
 equipe1.ajouterJoueur(joueur24);
 equipe1.ajouterJoueur(joueur25);
 equipe1.ajouterJoueur(joueur26);

        Joueur joueur207 = new Joueur("Walid Regragui",0, "ANT", equipe2);
        Joueur joueur27 = new Joueur("Y.BONO", 1, "GB", equipe2);
          Joueur joueur28 = new Joueur("A.HAKIMI", 2, "DEF", equipe2);
        Joueur joueur29= new Joueur("N.MAZRAOUI", 3, "DEF", equipe2);
        Joueur joueur30 = new Joueur("N.AMRABAT", 4, "MIL", equipe2);
         Joueur joueur31 = new Joueur("N.AGRUED", 5, "DEF", equipe2);
        Joueur joueur32 = new Joueur("R.SAISS", 6, "DEF", equipe2);
        Joueur joueur33 = new Joueur("H.ZIYECH", 7, "ATT", equipe2);
         Joueur joueur34 = new Joueur("A.OUNAHI", 8, "MIL", equipe2);
         Joueur joueur35 = new Joueur("A.HAMDALLAH", 9, "ATT", equipe2);
        Joueur joueur36 = new Joueur("A.ZARROURY", 10, "MIL", equipe2);
         Joueur joueur37 = new Joueur("A.SABIRI", 11, "MIL", equipe2);
         Joueur joueur38 = new Joueur("M.MHAMDI", 12, "GB", equipe2);
        Joueur joueur39 = new Joueur("I.CHAIR", 13, "ATT", equipe2);
         Joueur joueur40 = new Joueur("Z.Aboukhlal", 14, "ATT",equipe2);
          Joueur joueur41 = new Joueur("S. Amallah", 15, "MIL", equipe2);
         Joueur joueur42 = new Joueur("A. Ezzalzouli ", 16, "ATT", equipe2);
         Joueur joueur43 = new Joueur("S. Boufal", 17, "ATT", equipe2);
          Joueur joueur44 = new Joueur("J. ELYAMIQ", 18, "DEF",equipe2);
        Joueur joueur45 = new Joueur("Y.En-Nesyri", 19, "ATT", equipe2);
        Joueur joueur46 = new Joueur("A.Dari", 20, "DEF", equipe2);
         Joueur joueur47 = new Joueur("W.CHDDIRA", 21, "ATT", equipe2);
       Joueur joueur48 = new Joueur("A.TAGNAOUTI", 22, "GB", equipe2);
      Joueur joueur49 = new Joueur("B.KHANNOUSS", 23, "MIL", equipe2);
        Joueur joueur50 = new Joueur("B.BENNOUN", 24, "DEF", equipe2);
        Joueur joueur51 = new Joueur("YAHYA ATTIYATALLAH", 25, "DEF", equipe2);
        Joueur joueur52 = new Joueur("Y.JABRANE", 26, "MIL", equipe2);
         joueurs.add(joueur207);
        joueurs.add(joueur27);
        joueurs.add(joueur28);
        joueurs.add(joueur29);
        joueurs.add(joueur30);
        joueurs.add(joueur31);
        joueurs.add(joueur32);
joueurs.add(joueur33);
joueurs.add(joueur34);
joueurs.add(joueur35);
joueurs.add(joueur36);
joueurs.add(joueur37);
joueurs.add(joueur38);
joueurs.add(joueur39);
joueurs.add(joueur40);
joueurs.add(joueur41);
joueurs.add(joueur42);
joueurs.add(joueur43);
joueurs.add(joueur44);
joueurs.add(joueur45);
joueurs.add(joueur46);
joueurs.add(joueur47);
joueurs.add(joueur48);
joueurs.add(joueur49);       
joueurs.add(joueur50);
joueurs.add(joueur51);
joueurs.add(joueur52);
        equipe2.ajouterJoueur(joueur207);
         equipe2.ajouterJoueur(joueur27);
        equipe2.ajouterJoueur(joueur28);
         equipe2.ajouterJoueur(joueur29);
        equipe2.ajouterJoueur(joueur30);
         equipe2.ajouterJoueur(joueur31);
         equipe2.ajouterJoueur(joueur32);
 equipe2.ajouterJoueur(joueur33);
 equipe2.ajouterJoueur(joueur34);
 equipe2.ajouterJoueur(joueur35);
 equipe2.ajouterJoueur(joueur36);
 equipe2.ajouterJoueur(joueur37);
 equipe2.ajouterJoueur(joueur38);
 equipe2.ajouterJoueur(joueur39);
 equipe2.ajouterJoueur(joueur40);
 equipe2.ajouterJoueur(joueur41);
 equipe2.ajouterJoueur(joueur42);
 equipe2.ajouterJoueur(joueur43);
 equipe2.ajouterJoueur(joueur44);
 equipe2.ajouterJoueur(joueur45);
equipe2.ajouterJoueur(joueur46);
equipe2.ajouterJoueur(joueur47);
equipe2.ajouterJoueur(joueur48);
equipe2.ajouterJoueur(joueur49);       
equipe2.ajouterJoueur(joueur50);
equipe2.ajouterJoueur(joueur51);
equipe2.ajouterJoueur(joueur52);
     Joueur joueur208 = new Joueur("Deschamps",0, "ANT", equipe3);
       Joueur joueur53 = new Joueur("Franco Armani", 1, "GB", equipe3);
        Joueur joueur54 = new Joueur("Juan Foyth", 2, "DEF",equipe3);
        Joueur joueur55= new Joueur("Nicolas Tagliafico", 3, "DEF",equipe3);
        Joueur joueur56 = new Joueur("Gonzalo Montiel", 4, "MIL",equipe3);
        Joueur joueur57 = new Joueur(" Leandro Paredes", 5, "DEF",equipe3);
        Joueur joueur58 = new Joueur(" German Pezzella", 6, "DEF",equipe3);
        Joueur joueur59 = new Joueur("Rodrigo De Paul", 7, "ATT",equipe3);
        Joueur joueur60 = new Joueur("Marcos Acuña ", 8, "MIL", equipe3);
         Joueur joueur61 = new Joueur("Youssouf Fofana", 9, "ATT", equipe3);
        Joueur joueur62 = new Joueur("Lionel Messi", 10, "MIL",equipe3);
         Joueur joueur63= new Joueur("Julian Alvarez", 11, "MIL",equipe3);
         Joueur joueur64 = new Joueur("Angel Di Maria ", 12, "GB", equipe3);
        Joueur joueur65 = new Joueur(" Geronimo Rullié", 13, "ATT", equipe3);
         Joueur joueur66 = new Joueur("  Cristian Romero", 14, "ATT",equipe3);
          Joueur joueur67 = new Joueur("Exequiel Palacios ", 15, "MIL", equipe3);
         Joueur joueur68 = new Joueur("  Nicolas Gonzalez ", 16, "ATT", equipe3);
         Joueur joueur69 = new Joueur(" Angel Correa", 17, "ATT",  equipe3);
          Joueur joueur70 = new Joueur(" Thiago Almada", 18, "DEF", equipe3);
        Joueur joueur71 = new Joueur("Marcus Thuram ", 19, "ATT",  equipe3);
        Joueur joueur72 = new Joueur("Papu Gomez", 20, "DEF", equipe3);
         Joueur joueur73 = new Joueur(" Guido Rodriguez  ", 21, "ATT", equipe3);
       Joueur joueur74 = new Joueur(" Nicolas Otamendi", 22, "GB", equipe3);
      Joueur joueur75 = new Joueur("Alexis Mac Allister", 23, "MIL",  equipe3);
        Joueur joueur76 = new Joueur(" Paulo Dybala", 24, "DEF",  equipe3);
        Joueur joueur77 = new Joueur("Lautaro Martinez ", 25, "DEF", equipe3);
        Joueur joueur78 = new Joueur(" Emiliano Martinez (", 26, "MIL", equipe3); 
      joueurs.add(joueur208); 
 joueurs.add(joueur53);
joueurs.add(joueur54);
joueurs.add(joueur55);
joueurs.add(joueur56);
joueurs.add(joueur57);
joueurs.add(joueur58);
joueurs.add(joueur59);
joueurs.add(joueur60);
joueurs.add(joueur61);
joueurs.add(joueur62);
joueurs.add(joueur63);
joueurs.add(joueur64);
joueurs.add(joueur65);
joueurs.add(joueur66);
joueurs.add(joueur67);
joueurs.add(joueur68);
joueurs.add(joueur69);
joueurs.add(joueur70);
joueurs.add(joueur71);
joueurs.add(joueur72);
joueurs.add(joueur73);
joueurs.add(joueur74);
joueurs.add(joueur75);       
joueurs.add(joueur76);
joueurs.add(joueur77);
joueurs.add(joueur78);
equipe3.ajouterJoueur(joueur208);
equipe3.ajouterJoueur(joueur53);
equipe3.ajouterJoueur(joueur54);
equipe3.ajouterJoueur(joueur55);
equipe3.ajouterJoueur(joueur56);
 equipe3.ajouterJoueur(joueur57);
 equipe3.ajouterJoueur(joueur58);
 equipe3.ajouterJoueur(joueur59);
 equipe3.ajouterJoueur(joueur60);
 equipe3.ajouterJoueur(joueur61);
 equipe3.ajouterJoueur(joueur62);
 equipe3.ajouterJoueur(joueur63);
 equipe3.ajouterJoueur(joueur64);
 equipe3.ajouterJoueur(joueur65);
 equipe3.ajouterJoueur(joueur66);
 equipe3.ajouterJoueur(joueur67);
 equipe3.ajouterJoueur(joueur68);
 equipe3.ajouterJoueur(joueur69);
 equipe3.ajouterJoueur(joueur70);
 equipe3.ajouterJoueur(joueur71);
 equipe3.ajouterJoueur(joueur72);
 equipe3.ajouterJoueur(joueur73);
 equipe3.ajouterJoueur(joueur74);
 equipe3.ajouterJoueur(joueur75);       
 equipe3.ajouterJoueur(joueur76);
 equipe3.ajouterJoueur(joueur77);
 equipe3.ajouterJoueur(joueur78);
 Joueur joueur211 = new Joueur("Lionel Scaloni",0, "ANT", equipe4);
        Joueur joueur79 = new Joueur(" Jordan PickfordY", 1, "GB",equipe4);
          Joueur joueur80 = new Joueur(" Kyle Walker", 2, "DEF",equipe4);
        Joueur joueur81= new Joueur(" John Stones", 3, "DEF", equipe4);
        Joueur joueur82 = new Joueur("Luke Shaw ", 4, "MIL",equipe4);
         Joueur joueur83 = new Joueur("Declan Rice", 5, "DEF", equipe4);
        Joueur joueur84 = new Joueur("John Stones ", 6, "DEF", equipe4);
        Joueur joueur85 = new Joueur("Harry Maguire", 7, "ATT",equipe4);
         Joueur joueur86 = new Joueur(" Jack Grealish", 8, "MIL",equipe4);
         Joueur joueur87 = new Joueur(" Jordan Henderson", 9, "ATT",equipe4);
        Joueur joueur88 = new Joueur(" Harry Kane", 10, "MIL",equipe4);
         Joueur joueur89 = new Joueur("Raheem SterlingI", 11, "MIL", equipe4);
         Joueur joueur90 = new Joueur("Nick Pope", 12, "GB", equipe4);
        Joueur joueur91 = new Joueur(" Marcus Rashford", 13, "ATT",equipe4);
         Joueur joueur92 = new Joueur("Kieran Trippier", 14, "ATT", equipe4);
          Joueur joueur93 = new Joueur(" Nick Pope ", 15, "MIL",equipe4);
         Joueur joueur94 = new Joueur("Kalvin Phillips ", 16, "ATT", equipe4);
         Joueur joueur95 = new Joueur("Eric Dier", 17, "ATT",equipe4);
          Joueur joueur96 = new Joueur(" Conor Coady", 18, "DEF",equipe4);
        Joueur joueur97 = new Joueur(" Bukayo Saka", 19, "ATT",equipe4);
        Joueur joueur98 = new Joueur("Trent Alexander-Arnold ", 20, "DEF",equipe4);
         Joueur joueur99 = new Joueur("Kalvin Phillips", 21, "ATT",equipe4);
       Joueur joueur100 = new Joueur("Mason Mount", 22, "GB",equipe4);
      Joueur joueur101 = new Joueur(" Phil Foden ", 23, "MIL",equipe4);
        Joueur joueur102 = new Joueur("Ben White", 24, "DEF",equipe4);
        Joueur joueur103 = new Joueur("Jude Bellingham", 25, "DEF", equipe4);
        Joueur joueur104 = new Joueur(" Aaron Ramsdale", 26, "MIL", equipe4);
         joueurs.add(joueur211);
        joueurs.add(joueur79);
        joueurs.add(joueur80);
        joueurs.add(joueur81);
        joueurs.add(joueur82);
        joueurs.add(joueur83);
        joueurs.add(joueur84);
joueurs.add(joueur85);
joueurs.add(joueur86);
joueurs.add(joueur87);
joueurs.add(joueur88);
joueurs.add(joueur89);
joueurs.add(joueur90);
joueurs.add(joueur91);
joueurs.add(joueur92);
joueurs.add(joueur93);
joueurs.add(joueur94);
joueurs.add(joueur95);
joueurs.add(joueur96);
joueurs.add(joueur97);
joueurs.add(joueur98);
joueurs.add(joueur99);
joueurs.add(joueur100);
joueurs.add(joueur101);       
joueurs.add(joueur102);
joueurs.add(joueur103);
joueurs.add(joueur104);

        equipe4.ajouterJoueur(joueur211);
        equipe4.ajouterJoueur(joueur79);
         equipe4.ajouterJoueur(joueur80);
        equipe4.ajouterJoueur(joueur81);
         equipe4.ajouterJoueur(joueur82);
        equipe4.ajouterJoueur(joueur83);
         equipe4.ajouterJoueur(joueur84);
         equipe4.ajouterJoueur(joueur85);
 equipe4.ajouterJoueur(joueur86);
 equipe4.ajouterJoueur(joueur87);
 equipe4.ajouterJoueur(joueur88);
 equipe4.ajouterJoueur(joueur89);
 equipe4.ajouterJoueur(joueur90);
 equipe4.ajouterJoueur(joueur91);
 equipe4.ajouterJoueur(joueur92);
 equipe4.ajouterJoueur(joueur93);
 equipe4.ajouterJoueur(joueur94);
 equipe4.ajouterJoueur(joueur95);
 equipe4.ajouterJoueur(joueur96);
 equipe4.ajouterJoueur(joueur97);
 equipe4.ajouterJoueur(joueur98);
equipe4.ajouterJoueur(joueur99);
equipe4.ajouterJoueur(joueur100);
equipe4.ajouterJoueur(joueur101);
equipe4.ajouterJoueur(joueur102);       
equipe4.ajouterJoueur(joueur103);
equipe4.ajouterJoueur(joueur104);
Joueur joueur209 = new Joueur("Gareth Southgate ",0, "ANT", equipe5);
 Joueur joueur105 = new Joueur(" Jordan PickfordYO", 1, "GB",equipe5);
          Joueur joueur106 = new Joueur(" Kyle Walker", 2, "DEF",equipe5);
        Joueur joueur107= new Joueur("N.MAZRAOUI", 3, "DEF", equipe5);
        Joueur joueur108 = new Joueur("Luke Shaw ", 4, "MIL",equipe5);
         Joueur joueur109 = new Joueur("Declan Rice", 5, "DEF", equipe5);
        Joueur joueur110 = new Joueur("John Stones ", 6, "DEF", equipe5);
        Joueur joueur111 = new Joueur("Harry Maguire", 7, "ATT",equipe5);
         Joueur joueur112 = new Joueur(" Jack Grealish", 8, "MIL",equipe5);
         Joueur joueur113 = new Joueur(" Jordan Henderson", 9, "ATT",equipe5);
        Joueur joueur114 = new Joueur(" Harry Kane", 10, "MIL",equipe5);
         Joueur joueur115 = new Joueur("Raheem SterlingI", 11, "MIL", equipe5);
         Joueur joueur116 = new Joueur("M.MHAMDI", 12, "GB", equipe5);
        Joueur joueur117 = new Joueur(" Marcus Rashford", 13, "ATT",equipe5);
         Joueur joueur118 = new Joueur("Kieran Trippier", 14, "ATT", equipe5);
          Joueur joueur119 = new Joueur(" Nick Pope ", 15, "MIL",equipe5);
         Joueur joueur120 = new Joueur("Kalvin Phillips ", 16, "ATT", equipe5);
         Joueur joueur121 = new Joueur("Eric Dier", 17, "ATT",equipe5);
          Joueur joueur122 = new Joueur(" Conor Coady", 18, "DEF",equipe5);
        Joueur joueur123 = new Joueur(" Bukayo Saka", 19, "ATT",equipe5);
        Joueur joueur124 = new Joueur("Trent Alexander-Arnold ", 20, "DEF",equipe5);
         Joueur joueur125 = new Joueur("W.CHDDIRA", 21, "ATT",equipe5);
       Joueur joueur126 = new Joueur("Mason Mount", 22, "GB",equipe5);
      Joueur joueur127 = new Joueur(" Phil Foden ", 23, "MIL",equipe5);
        Joueur joueur128 = new Joueur("Ben White", 24, "DEF",equipe5);
        Joueur joueur129 = new Joueur("Jude Bellingham", 25, "DEF", equipe5);
        Joueur joueur130 = new Joueur(" Aaron Ramsdale", 26, "MIL", equipe5);
        joueurs.add(joueur209);
        joueurs.add(joueur105);
        joueurs.add(joueur106);
        joueurs.add(joueur107);
        joueurs.add(joueur108);
        joueurs.add(joueur109);
        joueurs.add(joueur110);
joueurs.add(joueur111);
joueurs.add(joueur112);
joueurs.add(joueur113);
joueurs.add(joueur114);
joueurs.add(joueur115);
joueurs.add(joueur116);
joueurs.add(joueur117);
joueurs.add(joueur118);
joueurs.add(joueur119);
joueurs.add(joueur120);
joueurs.add(joueur121);
joueurs.add(joueur122);
joueurs.add(joueur123);
joueurs.add(joueur124);
joueurs.add(joueur125);
joueurs.add(joueur126);
joueurs.add(joueur127);       
joueurs.add(joueur128);
joueurs.add(joueur129);
joueurs.add(joueur130);
equipe5.ajouterJoueur(joueur209);
        equipe5.ajouterJoueur(joueur105);
         equipe5.ajouterJoueur(joueur106);
        equipe5.ajouterJoueur(joueur107);
         equipe5.ajouterJoueur(joueur108);
        equipe5.ajouterJoueur(joueur109);
         equipe5.ajouterJoueur(joueur110);
         equipe5.ajouterJoueur(joueur111);
 equipe5.ajouterJoueur(joueur112);
 equipe5.ajouterJoueur(joueur113);
 equipe5.ajouterJoueur(joueur114);
 equipe5.ajouterJoueur(joueur115);
 equipe5.ajouterJoueur(joueur116);
 equipe5.ajouterJoueur(joueur117);
 equipe5.ajouterJoueur(joueur118);
 equipe5.ajouterJoueur(joueur119);
 equipe5.ajouterJoueur(joueur120);
 equipe5.ajouterJoueur(joueur121);
 equipe5.ajouterJoueur(joueur122);
 equipe5.ajouterJoueur(joueur123);
 equipe5.ajouterJoueur(joueur124);
equipe5.ajouterJoueur(joueur125);
equipe5.ajouterJoueur(joueur126);
equipe5.ajouterJoueur(joueur127);
equipe5.ajouterJoueur(joueur128);       
equipe5.ajouterJoueur(joueur129);
equipe5.ajouterJoueur(joueur130); 


       
Joueur joueur210 = new Joueur("Zlatko Dalic",0, "ANT", equipe6);
       Joueur joueur131 = new Joueur(" Dominik Livakovic", 1, "GB",equipe6);
        Joueur joueur132 = new Joueur("Josip Stanisic", 2, "DEF",equipe6);
        Joueur joueur133= new Joueur(" Borna Barisic", 3, "DEF",equipe6);
        Joueur joueur134 = new Joueur("Ivan Perisic ", 4, "MIL",equipe6);
        Joueur joueur135 = new Joueur("Martin Erlic", 5, "DEF",equipe6);
        Joueur joueur136 = new Joueur("Dejan Lovren ", 6, "DEF",equipe6);
        Joueur joueur137 = new Joueur("Lovro Majer", 7, "ATT",equipe6);
        Joueur joueur138 = new Joueur(" Mateo Kovacic", 8, "MIL",equipe6);
        Joueur joueur139 = new Joueur(" Andrej Kramaric", 9, "ATT",equipe6);
        Joueur joueur140 = new Joueur(" Luka Modric", 10, "MIL",equipe6);
        Joueur joueur141 = new Joueur(" Marcelo Brozovic", 11, "MIL",equipe6);
        Joueur joueur142 = new Joueur(" Ivo Grbic ", 12, "GB", equipe6);
        Joueur joueur143 = new Joueur("Nikola Vlasic", 13, "ATT",equipe6);
        Joueur joueur144 = new Joueur(" Mario Pasalic  ", 14, "ATT",equipe6);
        Joueur joueur145 = new Joueur(" Bruno Petkovic ", 15, "MIL",equipe6);
        Joueur joueur146 = new Joueur("Ante Budimir  ", 16, "ATT",equipe6);
        Joueur joueur147 = new Joueur("Mislav Orsic", 17, "ATT",equipe6);
        Joueur joueur148 = new Joueur("  Borna Sosa", 18, "DEF",equipe6);
        Joueur joueur149 = new Joueur("Josko Gvardiol", 19, "ATT",equipe6);
        Joueur joueur150 = new Joueur("Domagoj Vida", 20, "DEF",equipe6);
         Joueur joueur151 = new Joueur("Josip Juranovic", 21, "ATT",equipe6);
       Joueur joueur152 = new Joueur(" Ivica Ivusic", 22, "GB",equipe6);
      Joueur joueur153 = new Joueur(" Josip Sutalo  ", 23, "MIL",equipe6);
        Joueur joueur154 = new Joueur("Luka Sucic", 24, "DEF",equipe6);
         Joueur joueur155 = new Joueur("Otavio", 25, "DEF",equipe6);
          joueurs.add(joueur210);
         joueurs.add(joueur131);
        joueurs.add(joueur131);
         joueurs.add(joueur132);
        joueurs.add(joueur133);
        joueurs.add(joueur134);
        joueurs.add(joueur135);
        joueurs.add(joueur136);
        joueurs.add(joueur137);
joueurs.add(joueur138);
joueurs.add(joueur139);
joueurs.add(joueur140);
joueurs.add(joueur141);
joueurs.add(joueur142);
joueurs.add(joueur143);
joueurs.add(joueur144);
joueurs.add(joueur145);
joueurs.add(joueur146);
joueurs.add(joueur147);
joueurs.add(joueur148);
joueurs.add(joueur149);
joueurs.add(joueur150);
joueurs.add(joueur151);
joueurs.add(joueur152);
joueurs.add(joueur153);
joueurs.add(joueur154);       
joueurs.add(joueur155);
  equipe6.ajouterJoueur(joueur210);
      equipe6.ajouterJoueur(joueur131);
         equipe6.ajouterJoueur(joueur132);
        equipe6.ajouterJoueur(joueur133);
         equipe6.ajouterJoueur(joueur134);
        equipe6.ajouterJoueur(joueur135);
         equipe6.ajouterJoueur(joueur136);
         equipe6.ajouterJoueur(joueur137);
 equipe6.ajouterJoueur(joueur138);
 equipe6.ajouterJoueur(joueur139);
 equipe6.ajouterJoueur(joueur140);
 equipe6.ajouterJoueur(joueur141);
 equipe6.ajouterJoueur(joueur142);
 equipe6.ajouterJoueur(joueur143);
 equipe6.ajouterJoueur(joueur144);
 equipe6.ajouterJoueur(joueur145);
 equipe6.ajouterJoueur(joueur146);
 equipe6.ajouterJoueur(joueur147);
 equipe6.ajouterJoueur(joueur148);
 equipe6.ajouterJoueur(joueur149);
 equipe6.ajouterJoueur(joueur150);
equipe6.ajouterJoueur(joueur151);
equipe6.ajouterJoueur(joueur152);
equipe6.ajouterJoueur(joueur153);
equipe6.ajouterJoueur(joueur154);       
equipe6.ajouterJoueur(joueur155);
 

Joueur joueur212 = new Joueur("Fernando Santos ",0, "ANT", equipe7);
Joueur joueur156 = new Joueur(" Rui Patrício", 1, "GB",equipe7);
        Joueur joueur157 = new Joueur(" Diogo Dalot ", 2, "DEF",equipe7);
        Joueur joueur158= new Joueur(" Pepe", 3, "DEF", equipe7);
        Joueur joueur159 = new Joueur("Ruben Dias ", 4, "MIL",equipe7);
        Joueur joueur160 = new Joueur("Raphaël Guerreiro", 5, "DEF",equipe7);
        Joueur joueur161 = new Joueur("João Palhinha ", 6, "DEF", equipe7);
        Joueur joueur162 = new Joueur("Cristiano Ronaldo ", 7, "ATT",equipe7);
        Joueur joueur163 = new Joueur(" Bruno Fernandes", 8, "MIL",equipe7);
        Joueur joueur164 = new Joueur(" Andre Silva", 9, "ATT",equipe7);
        Joueur joueur165 = new Joueur("  Bernardo Silva", 10, "MIL",equipe7);
        Joueur joueur166 = new Joueur("João Félix", 11, "MIL",equipe7);
        Joueur joueur167 = new Joueur(" José Sa ", 12, "GB", equipe7);
        Joueur joueur168 = new Joueur("  William Carvalho", 13, "ATT",equipe7);
        Joueur joueur169 = new Joueur("Rafael Leao  ", 14, "ATT",equipe7);
        Joueur joueur170 = new Joueur(" Vitinha ", 15, "MIL",equipe7);
        Joueur joueur171 = new Joueur(" João Mário ", 16, "ATT",equipe7);
        Joueur joueur172 = new Joueur(" Rúben Neves", 17, "ATT",equipe7);
        Joueur joueur173 = new Joueur(" Nuno Mendes ", 18, "DEF",equipe7);
        Joueur joueur174 = new Joueur("Diogo Costa", 19, "ATT",equipe7);
        Joueur joueur175 = new Joueur("Matheus Nunes ", 20, "DEF",equipe7);
         Joueur joueur176 = new Joueur(" Antonio Silva", 21, "ATT",equipe7);
       Joueur joueur177 = new Joueur(" Otavio", 22, "GB",equipe7);
      Joueur joueur178 = new Joueur(" Goncalo Ramos   ", 23, "MIL",equipe7);
        Joueur joueur179 = new Joueur("João Félix", 24, "DEF",equipe7);
       joueurs.add(joueur212);
        joueurs.add(joueur156);
         joueurs.add(joueur157);
        joueurs.add(joueur158);
        joueurs.add(joueur159);
        joueurs.add(joueur160);
        joueurs.add(joueur161);
        joueurs.add(joueur162);
joueurs.add(joueur163);
joueurs.add(joueur164);
joueurs.add(joueur165);
joueurs.add(joueur166);
joueurs.add(joueur167);
joueurs.add(joueur168);
joueurs.add(joueur169);
joueurs.add(joueur170);
joueurs.add(joueur171);
joueurs.add(joueur172);
joueurs.add(joueur173);
joueurs.add(joueur174);
joueurs.add(joueur175);
joueurs.add(joueur176);
joueurs.add(joueur177);
joueurs.add(joueur178);
joueurs.add(joueur179);       
equipe7.ajouterJoueur(joueur212);
      equipe7.ajouterJoueur(joueur156);
         equipe7.ajouterJoueur(joueur157);
        equipe7.ajouterJoueur(joueur158);
         equipe7.ajouterJoueur(joueur159);
        equipe7.ajouterJoueur(joueur160);
         equipe7.ajouterJoueur(joueur161);
         equipe7.ajouterJoueur(joueur162);
         equipe7.ajouterJoueur(joueur163);
        equipe7.ajouterJoueur(joueur164);
 equipe7.ajouterJoueur(joueur165);
 equipe7.ajouterJoueur(joueur166);
 equipe7.ajouterJoueur(joueur167);
 equipe7.ajouterJoueur(joueur168);
 equipe7.ajouterJoueur(joueur169);
 equipe7.ajouterJoueur(joueur170);
 equipe7.ajouterJoueur(joueur171);
 equipe7.ajouterJoueur(joueur172);
 equipe7.ajouterJoueur(joueur173);
 equipe7.ajouterJoueur(joueur174);
 equipe7.ajouterJoueur(joueur175);
equipe7.ajouterJoueur(joueur176);
equipe7.ajouterJoueur(joueur177);
equipe7.ajouterJoueur(joueur178);
equipe7.ajouterJoueur(joueur179);       
 
Joueur joueur213= new Joueur("Tite ",0, "ANT", equipe8);
        Joueur joueur180 = new Joueur(" Alisson", 1, "GB",equipe8);
        Joueur joueur181 = new Joueur("Luiz Danilo ", 2, "DEF",equipe8);
        Joueur joueur182= new Joueur(" Thiago Silva", 3, "DEF", equipe8);
        Joueur joueur183 = new Joueur("Marquinhos", 4, "MIL",equipe8);
        Joueur joueur184 = new Joueur("Casemiro o", 5, "DEF",equipe8);
        Joueur joueur185 = new Joueur("Alex Sandro ", 6, "DEF",equipe8);
        Joueur joueur186 = new Joueur(" Lucas Paqueta", 7, "ATT",equipe8);
        Joueur joueur187 = new Joueur(" Fred", 8, "MIL",equipe8);
        Joueur joueur188 = new Joueur(" Richarlison", 9, "ATT",equipe8);
        Joueur joueur189 = new Joueur(" Neymar", 10, "MIL",equipe8);
        Joueur joueur190 = new Joueur(" Raphinha ", 11, "MIL",equipe8);
        Joueur joueur191 = new Joueur(" Weverton ", 12, "GB", equipe8);
        Joueur joueur192 = new Joueur("  Daniel Alves", 13, "ATT",equipe8);
        Joueur joueur193 = new Joueur("Eder Militao  ", 14, "ATT",equipe8);
        Joueur joueur194 = new Joueur(" Fabinho  ", 15, "MIL",equipe8);
        Joueur joueur195 = new Joueur(" Alex Telles ", 16, "ATT",equipe8);
        Joueur joueur196 = new Joueur(" Bruno Guimaraes", 17, "ATT",equipe8);
        Joueur joueur197 = new Joueur("  Gabriel Jesus ", 18, "DEF",equipe8);
        Joueur joueur198 = new Joueur("Antony", 19, "ATT",equipe8);
        Joueur joueur199 = new Joueur("Vinicius Junior ", 20, "DEF",equipe8);
         Joueur joueur200 = new Joueur(" Rodrygo", 21, "ATT",equipe8);
       Joueur joueur201 = new Joueur(" Everton Ribeiro", 22, "GB",equipe8);
      Joueur joueur202 = new Joueur("  Ederson  ", 23, "MIL",equipe8);
        Joueur joueur203 = new Joueur(" Gleison Bremer", 24, "DEF",equipe8);
        Joueur joueur204 = new Joueur(" dos Santos Pedro", 24, "DEF",equipe8);
        Joueur joueur205 = new Joueur("Gabriel Martinelli", 24, "DEF",equipe8);
        joueurs.add(joueur213);
        joueurs.add(joueur180);
         joueurs.add(joueur181);
        joueurs.add(joueur182);
        joueurs.add(joueur183);
        joueurs.add(joueur184);
        joueurs.add(joueur185);
        joueurs.add(joueur186);
joueurs.add(joueur187);
joueurs.add(joueur188);
joueurs.add(joueur189);
joueurs.add(joueur190);
joueurs.add(joueur191);
joueurs.add(joueur192);
joueurs.add(joueur193);
joueurs.add(joueur194);
joueurs.add(joueur195);
joueurs.add(joueur196);
joueurs.add(joueur197);
joueurs.add(joueur198);
joueurs.add(joueur199);
joueurs.add(joueur200);
joueurs.add(joueur201);
joueurs.add(joueur202);
joueurs.add(joueur203);       
joueurs.add(joueur204); 
joueurs.add(joueur205); 
   equipe8.ajouterJoueur(joueur213);
      equipe8.ajouterJoueur(joueur180);
         equipe8.ajouterJoueur(joueur181);
        equipe8.ajouterJoueur(joueur182);
         equipe8.ajouterJoueur(joueur183);
        equipe8.ajouterJoueur(joueur184);
         equipe8.ajouterJoueur(joueur185);
         equipe8.ajouterJoueur(joueur186);
 equipe8.ajouterJoueur(joueur187);
 equipe8.ajouterJoueur(joueur188);
 equipe8.ajouterJoueur(joueur189);
 equipe8.ajouterJoueur(joueur190);
 equipe8.ajouterJoueur(joueur191);
 equipe8.ajouterJoueur(joueur192);
 equipe8.ajouterJoueur(joueur193);
 equipe8.ajouterJoueur(joueur194);
 equipe8.ajouterJoueur(joueur195);
 equipe8.ajouterJoueur(joueur196);
 equipe8.ajouterJoueur(joueur197);
 equipe8.ajouterJoueur(joueur198);
 equipe8.ajouterJoueur(joueur199);
equipe8.ajouterJoueur(joueur200);
equipe8.ajouterJoueur(joueur201);
equipe8.ajouterJoueur(joueur202);
equipe8.ajouterJoueur(joueur203);       
equipe8.ajouterJoueur(joueur204);  
equipe8.ajouterJoueur(joueur205);  
 

        
        
        // Insérer les matches
        Match match1 = new Match(equipe4, equipe1, 1, 2);
        Match match2 = new Match(equipe2, equipe7, 1, 0);
        Match match3 = new Match(equipe5, equipe3, 2, 2);
        Match match4 = new Match(equipe6, equipe8, 1, 1);
        Match match5 = new Match(equipe2, equipe7, 3, 0);
        Match match6 = new Match(equipe1, equipe2, 2, 0);
        Match match7 = new Match(equipe6, equipe2, 2, 1);
        Match match8 = new Match(equipe1, equipe3, 3, 3);
        matches.add(match1);
        matches.add(match2);
        matches.add(match3);
        matches.add(match4);
        matches.add(match5);
        matches.add(match6);
        matches.add(match7);
        matches.add(match8);

        int choix;
        do {
            System.out.println("Menu:");
            System.out.println("1. Consulter les matches");
            System.out.println("2. Consulter les équipes");
            System.out.println("3. Consulter les classements");
            System.out.println("4. Consulter les joueurs");
            System.out.println("0. Quitter");

            System.out.print("Entrez votre choix : ");
            choix = scanner.nextInt();
            scanner.nextLine(); // Consommer la nouvelle ligne

            switch (choix) {
                case 1:
                    // Logique pour consulter les matches
                    System.out.println("Vous avez choisi de consulter les matches.");
                    // Demander à l'utilisateur de saisir deux équipes
                    System.out.print("Entrez le nom de la première équipe: ");
                    String nomEquipe1 = scanner.nextLine();
                    System.out.print("Entrez le nom de la deuxième équipe: ");
                    String nomEquipe2 = scanner.nextLine();

                    // Rechercher les équipes dans la liste des matches
                    boolean matchTrouve = false;
                    for (Match match : matches) {
                        if ((match.getEquipe1().getNom().equals(nomEquipe1) && match.getEquipe2().getNom().equals(nomEquipe2)) ||
                            (match.getEquipe1().getNom().equals(nomEquipe2) && match.getEquipe2().getNom().equals(nomEquipe1))) {
                            System.out.println("Match trouvé!");
                            System.out.println("Score de " + match.getEquipe1().getNom() + ": " + match.getScoreEquipe1());
                            System.out.println("Score de " + match.getEquipe2().getNom() + ": " + match.getScoreEquipe2());
                            matchTrouve = true;
                            break;
                        }
                    }

                    // Afficher un message si le match n'a pas été trouvé
                    if (!matchTrouve) {
                        System.out.println("Aucun match trouvé entre ces deux équipes.");
                    }
                    break;

                case 2:
                    // Logique pour consulter les équipes
                    System.out.println("Vous avez choisi de consulter les équipes.");
                    // Rechercher l'équipe dans la liste des équipes
                    System.out.print("Entrez le nom de l'équipe : ");
                    String nomEquipe = scanner.nextLine();
                    Equipe equipeSelectionnee = null;

                    for (Equipe equipe : equipes) {
                        if (equipe.getNom().equalsIgnoreCase(nomEquipe)) {
                            equipeSelectionnee = equipe;
                            break;
                        }
                    }

                    if (equipeSelectionnee != null) {
                        // Afficher le nom de l'équipe
                        System.out.println("Équipe : " + equipeSelectionnee.getNom());

                        // Afficher les joueurs de l'équipe
                        System.out.println("Joueurs de l'équipe :");
                        for (Joueur joueur : equipeSelectionnee.getJoueurs()) {
                            System.out.println(joueur.getNom() + " - Maillot : " + joueur.getMaillot() +
                                    " - Position : " + joueur.getPosition());
                        }
                    } else {
                        System.out.println("L'équipe avec le nom " + nomEquipe + " n'existe pas.");
                    }
                    break;

                case 3:
                    // Logique pour consulter les classements
                    Classement.ordreClassement();;
                    break;

                case 4:
                    // Logique pour consulter les joueurs
                    System.out.println("Vous avez choisi de consulter les joueurs.");
                    // Demander à l'utilisateur de saisir le nom du joueur
                    System.out.print("Entrez le nom du joueur : ");
                    String nomJoueur = scanner.nextLine();

                    // Rechercher le joueur dans la liste des joueurs de toutes les équipes
                    Joueur joueurSelectionne = null;
                    for (Joueur joueur : joueurs) {
                        if (joueur.getNom().equalsIgnoreCase(nomJoueur)) {
                            joueurSelectionne = joueur;
                            break;
                        }
                    }

                    if (joueurSelectionne != null) {
                        // Afficher les détails du joueur
                        System.out.println("Joueur : " + joueurSelectionne.getNom());
                        System.out.println("Position : " + joueurSelectionne.getPosition());
                        System.out.println("Équipe : " + joueurSelectionne.getEquipe().getNom());
                        System.out.println("Numéro de maillot : " + joueurSelectionne.getMaillot());
                    } else {
                        System.out.println("Le joueur avec le nom " + nomJoueur + " n'existe pas.");
                    }
                    break;

                case 0:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide. Veuillez entrer un numéro valide.");
            }

        } while (choix != 0);
        scanner.close();
    }
}