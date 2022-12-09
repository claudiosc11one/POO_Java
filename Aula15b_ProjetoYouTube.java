package aula15b_projetoyoutube;
public class Aula15b_ProjetoYouTube {
    public static void main(String[] args) {
        // TODO code application logic here
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de  POO!");
        v[1] = new Video("Aula 12 de Python!!");
        v[2] = new Video("Aula 10 de HTML 5"); 
        
        //Pessoa p = new Pessoa("Jubileu", 22, "M", 20f); ->Não pode ser instanciado, pois Pessoa é uma Classe Abstrata
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto("Zeh", 29, "M", "Ze123");
        
        
        //System.out.println(v[0].toString());
        //System.out.println(g[0].toString());
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]); // Jubileu assite a HTML5
        vis[0].avaliar();
        System.out.println(vis[0].toString()); 
        
        vis[1] = new Visualizacao(g[0], v[1]); // Jubileu assiste a Python
        vis[0].avaliar(88.0f);
        System.out.println(vis[1].toString());
        
        
        
        
        
        
        //vis[2] = new Visualizacao(g[1], v[0]);
        //System.out.println(vis[2].toString());
        
        
        
    }
    
}
