package com.acarballeira.exercicio2_2;

/**
 * Clase que representa un coche con motor y ruedas.
 * Implementa Comparable para poder ordenar coches.
 * Usa ENUMS para tipos de motor y rueda (mejor que Strings).
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.1 - CORREGIDA
 */
public class Coche implements Comparable<Coche> {  // ✅ CORREGIDO: Añadido <Coche>

    // ============ ATRIBUTOS ============
    
    private String marca;
    private Motor motor;
    private Rueda[] ruedas;
    
    
    // ============ CONSTRUCTORES ============
    
    /**
     * Constructor con objetos Motor y array de Ruedas ya creados.
     * Permite crear coches con número variable de ruedas.
     * 
     * @param marca Marca del coche
     * @param motor Motor ya creado
     * @param ruedas Array de ruedas ya creadas
     */
    public Coche(String marca, Motor motor, Rueda[] ruedas) {
        this.marca = marca;
        this.motor = motor;
        this.ruedas = ruedas;
    }
    
    /**
     * Constructor simplificado que crea 4 ruedas automáticamente.
     * 
     * @param marca Marca del coche
     * @param caballos Potencia del motor en CV
     * @param tipoMotor Tipo de motor (enum)
     * @param tamanhoRueda Tamaño de las ruedas en pulgadas
     * @param tipoRueda Tipo de neumático (enum)
     */
    public Coche(String marca, int caballos, TipoMotor tipoMotor, int tamanhoRueda, TipoRueda tipoRueda) {
        this.marca = marca;
        this.motor = new Motor(caballos, tipoMotor);
        this.ruedas = new Rueda[4];
        for (int i = 0; i < ruedas.length; i++) {
            this.ruedas[i] = new Rueda(tamanhoRueda, tipoRueda);
        }
    }
    
    /**
     * Constructor que permite especificar el número de ruedas.
     * 
     * @param marca Marca del coche
     * @param caballos Potencia del motor en CV
     * @param tipoMotor Tipo de motor (enum)
     * @param tamanhoRueda Tamaño de las ruedas en pulgadas
     * @param tipoRueda Tipo de neumático (enum)
     * @param numRuedas Número de ruedas a crear
     */
    public Coche(String marca, int caballos, TipoMotor tipoMotor, int tamanhoRueda, TipoRueda tipoRueda, int numRuedas) {
        this.marca = marca;
        this.motor = new Motor(caballos, tipoMotor);
        this.ruedas = new Rueda[numRuedas];
        for (int i = 0; i < numRuedas; i++) {
            this.ruedas[i] = new Rueda(tamanhoRueda, tipoRueda);
        }
    }
    
    
    // ============ GETTERS ============
    
    public int getCaballosMotor() {
        return this.motor.getCaballos();
    }
    
    public TipoMotor getTipoMotor() {
        return this.motor.getTipo();
    }
    
    public String getMarca() {
        return marca;
    }
    
    public Motor getMotor() {
        return motor;
    }
    
    public Rueda[] getRuedas() {
        return ruedas;
    }
    
    
    // ============ MÉTODOS DE ACCIÓN ============
    
    /**
     * Arranca el coche.
     */
    public void arrancar() {
        System.out.println(" ... arrancando coche ...");
    }
    
    
    // ============ COMPARABLE ============
    
    /**
     * Compara este coche con otro según estos criterios en orden:
     * 1. Caballos del motor (menor CV primero, orden ascendente)
     * 2. Número de ruedas (menos ruedas primero)
     * 3. Tamaño de rueda (menor diámetro primero)
     * 4. Marca (orden alfabético A-Z)
     * 
     * @param otro Coche a comparar
     * @return -1 si este es menor, 1 si es mayor, 0 si son iguales
     */
    @Override
    public int compareTo(Coche otro) {
        
        // Comparamos CV (orden ascendente)
        if (this.motor.getCaballos() < otro.motor.getCaballos()) {
            return -1;
        } else if (this.motor.getCaballos() > otro.motor.getCaballos()) {
            return 1;
        }
        
        // Comparamos número de ruedas (orden ascendente)
        if (this.ruedas.length < otro.ruedas.length) {
            return -1;
        } else if (this.ruedas.length > otro.ruedas.length) { 
            return 1;
        }
        
        // Comparamos tamaño de rueda (orden ascendente)
        if (this.ruedas[0].getTamanho() < otro.ruedas[0].getTamanho()) {
            return -1;
        } else if (this.ruedas[0].getTamanho() > otro.ruedas[0].getTamanho()) {  
            return 1;
        }
        
        // Comparamos marca (orden alfabético)
        return this.marca.compareTo(otro.marca);
    }
    
    
    // ============ TOSTRING ============
    
    /**
     * Representación en texto del coche con formato tabular.
     * Capitaliza la primera letra de los enums para mejor presentación.
     * 
     * @return String formateado con la información del coche
     */
    @Override
    public String toString() {
        
        TipoRueda tipoRueda = this.ruedas[0].getTipo();
        TipoMotor tipoMotor = this.motor.getTipo();
        
        // Capitalizamos la primera letra
        String motorCapitalizado = capitalizar(tipoMotor);
        String ruedaCapitalizado = capitalizar(tipoRueda);
        
        return String.format("\n------------------\n"
                + "Marca: %s \n"
                + "Motor. CV: %d. %s\n"
                + "Ruedas. Número: %d. Diámetro: %d. Tipo: %s", 
                this.getMarca(), 
                this.motor.getCaballos(), 
                motorCapitalizado,
                this.ruedas.length, 
                this.ruedas[0].getTamanho(), 
                ruedaCapitalizado);
    }
    
    
    // ============ MÉTODOS PRIVADOS (UTILIDADES) ============
    
    /**
     * Capitaliza un enum TipoMotor.
     * Convierte "GASOLINA" → "Gasolina"
     * 
     * @param tipoMotor El enum a capitalizar
     * @return String capitalizado
     */
    private String capitalizar(TipoMotor tipoMotor) {  
        String texto = tipoMotor.toString();  
        return texto.substring(0, 1).toUpperCase() + texto.substring(1).toLowerCase();
    }
    
    /**
     * Capitaliza un enum TipoRueda.
     * Convierte "VERANO" → "Verano"
     * 
     * @param tipoRueda El enum a capitalizar
     * @return String capitalizado
     */
    private String capitalizar(TipoRueda tipoRueda) {
        String texto = tipoRueda.toString();
        return texto.substring(0, 1).toUpperCase() + texto.substring(1).toLowerCase();
    }
}
