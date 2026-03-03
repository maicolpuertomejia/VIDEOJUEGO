public class Personaje {


    //TRIBUTOS

    private String nombre;
    private int nivel;
    private int experiencia;
    private int vida;
    private boolean vivo;

    //CONSTRUCTOR VACIO

    public Personaje() {
    }


    //CONSTRUCTOR CON PARAMETROS


    public Personaje(String nombre, int nivel, int experiencia, int vida, boolean vivo) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.experiencia = experiencia;
        this.vida = vida;
        this.vivo = vivo;
    }


    //GETTER-SETTER

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    //METODOS PROPIOS

    //EXPERIENCIA

    public void ganarExperiencia(){
        if (vivo) {
            System.out.println("NO PUEDE GANAR EXPERIENCIA. MURIO ");

            experiencia += 10;
            System.out.println("GANASTE 10 PUNTOS DE EXPERIENCIA");


        }



    }

    //NIVEL

    public void subirNivel() {
        if (vivo) {
            System.out.println("NO PUEDE SUBIR DE NIVEL. ESTA MUERTO.");
            return;
        }
        nivel++;
        experiencia = 0;
        System.out.println(" SUBIO EL NIVEL Y LA EXPERIENCIA SE REINICIO A 0");

    }

    //RECIBIR DANIO

    public int recibirDanio() {
        if (vivo) {
            System.out.println(nombre + " YA ESTA MUERTO");
            return vida -= 15;
        if (vida <= 0) {
            vida = 0;
            vivo = false;
            System.out.println(nombre + " RECIBIO 15 DE DAÑO Y MURIO");
        } else {
            System.out.println(nombre + " RECIBIO 15 DE AÑO (VIDA: "+vida);
        }
    }
    //CURARSE

    public int curarse(){
            if(vivo){

            }
        }

        }


































}


