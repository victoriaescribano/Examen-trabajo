package PaqA11;

import javax.swing.*;

public class Hub {
        private Contenedor[][] contenedores;    // debe inicializarse con 10 filas y 12 columnas.
        private static int numContenedor = 1;           // utilizado para asignar un identificador (único en el
        // puerto) a cada contenedor antes de apilarlos.



        public Hub() {
            this.contenedores = new Contenedor[10][12];
        }


        public void setContenedores(Contenedor[][] contenedores) {
            this.contenedores = contenedores;
        }


        public Contenedor[][] getContenedores() {

            return contenedores;

        }


        public static int getNumContenedor() { return Hub.numContenedor; }



        public Contenedor mostrarDatos(int identificador) {
            Contenedor encontrado = null;

            for (int i = 0; i < this.contenedores.length; i++) {
                for (int j = 0; j < this.contenedores[0].length; j++) {
                    if (this.contenedores[i][j] != null && this.contenedores[i][j].getIdentificador() == identificador) {
                        encontrado = contenedores[i][j];
                    }
                }
            }

            return encontrado;
        }



        public boolean apilarContenedor(Contenedor cont) {
            if (cont != null) {
                cont.setIdentificador(Hub.numContenedor);
                Hub.numContenedor++;

                switch (cont.getPrioridad()) {
                    case 1:
                    case 2:
                        int col = cont.getPrioridad()-1;

                        for (int i = this.contenedores.length - 1; i >= 0; i--) {
                            if (this.contenedores[i][col] == null) {
                                this.contenedores[i][col] = cont;
                                return true;
                            }
                        }

                        break;

                    case 3:
                        for (int j = 2; j < this.contenedores[0].length; j++) {
                            for (int i = this.contenedores.length - 1; i >= 0; i--) {
                                if (this.contenedores[i][j] == null) {
                                    this.contenedores[i][j] = cont;
                                    return true;
                                }
                            }
                        }

                        break;
                }
            }

            return false;
        }


        public boolean desapilarContenedor(int columna) {
            boolean desapilado = false;

            if (columna >= 0 && columna < this.contenedores[0].length) {
                for (int i = 0; i < this.contenedores.length && !desapilado; i++) {
                    if (this.contenedores[i][columna] != null) {
                        this.contenedores[i][columna] = null;
                        desapilado = true;
                    }
                }
            }

            return desapilado;
        }


        public int calcularContenedoresPorPais(String procedencia) {
            int cont = 0;

            for (int i = 0; i < this.contenedores.length; i++) {
                for (int j = 0; j < this.contenedores[i].length; j++) {
                    if (this.contenedores[i][j] != null && procedencia.equals(this.contenedores[i][j].getProcedencia())) {
                        cont++;
                    }
                }
            }
            return cont;

        }



        public String toString() {
            StringBuffer s = new StringBuffer();

            for (int i = 0; i < this.contenedores.length; i++) {
                for (int j = 0; j < this.contenedores[i].length; j++) {
                    if (this.contenedores[i][j] != null) {
                        s.append("   O   ");
                    } else {
                        s.append("   L   ");
                    }
                }
                s.append("\n");
            }

            return s.toString();
        }
    }
