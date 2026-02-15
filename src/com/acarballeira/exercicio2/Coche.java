package com.acarballeira.exercicio2;

/**
 * Clase que representa un coche con motor y ruedas.
 * Implementa Comparable para poder ordenar coches.
 * 
 * Curso 2025-26
 * 
 * @author O.Alvarez
 * @version 1.1 - CORREGIDA
 */
public class Coche implements Comparable<Coche> {  // ✅ CORREGIDO: Añadido <Coche>

    // ============ CONSTANTES ============
    
    private final static int NUM_RUEDAS = 4;
    
    
    // ============ ATRIBUTOS ============
    
    private Motor motor;
    private Rueda[] ruedas;
    private String marca;  
    
    
    // ============ CONSTRUCTORES ============
    
    /**
     * Constructor simplificado que crea 4 ruedas automáticamente.
     * 
     * @param marca Marca del coche
     * @param caballos Potencia del motor en CV
     * @param tipoGasolina Tipo de combustible
     * @param diametroRueda Diámetro de las ruedas en pulgadas
     * @param tipoRueda Tipo de neumático
     */
    public Coche(String marca, int caballos, String tipoGasolina, int diametroRueda, String tipoRueda) {
        this.marca = marca;
        this.motor = new Motor(caballos, tipoGasolina);
        this.ruedas = new Rueda[NUM_RUEDAS];
        
        for (int i = 0; i < NUM_RUEDAS; i++) {
            this.ruedas[i] = new Rueda(tipoRueda, diametroRueda);
        }
    }
    
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
    
    
    // ============ GETTERS ============
    
    public String getMarca() {
        return this.marca;
    }
    
    public int getCaballos() {
        return this.motor.getCaballos();
    }
    
    public String getTipoGasolina() {
        return this.motor.getTipoGasolina();
    }
    
    public int getDiametroRueda() {
        return this.ruedas[0].getDiametroRueda();
    }
    
    public String getTipoRueda() {
        return this.ruedas[0].getTipoRueda();
    }
    
    
    // ============ MÉTODOS DE ACCIÓN ============
    
    /**
     * Arranca el coche (enciende el motor).
     */
    void arrancar() {
        this.motor.encender();
        System.out.println("Coche arrancado");
    }
    
    /**
     * Conduce el coche (hace rodar las ruedas).
     */
    void conducir() {
        System.out.println("Conduciendo el " + this.marca + "...");
        for (Rueda rueda : this.ruedas) {
            rueda.rodar();
        }
    }
    
    /**
     * Detiene el coche (apaga el motor).
     */
    void detener() {
        this.motor.apagar();
        System.out.println("Coche detenido");
    }
    
    
    // ============ COMPARABLE ============
    
    /**
     * Compara este coche con otro según estos criterios en orden:
     * 1. Caballos del motor (MENOR CV primero, orden ascendente)
     * 2. Número de ruedas (MENOS ruedas primero)
     * 3. Diámetro de rueda (MENOR diámetro primero)
     * 4. Marca (orden alfabético A-Z)
     * 
     * @param otro Coche a comparar
     * @return -1 si este es menor, 1 si es mayor, 0 si son iguales
     */
    @Override
    public int compareTo(Coche otro) {
        
        // Comparamos CV (ORDEN ASCENDENTE: menor CV = menor)
        if (this.motor.getCaballos() < otro.motor.getCaballos()) {
            return -1;  // ✅ CORREGIDO: era 1, ahora es -1
        } else if (this.motor.getCaballos() > otro.motor.getCaballos()) {
            return 1;   // ✅ CORREGIDO: era -1, ahora es 1
        }
        
        // Comparamos número de ruedas (ORDEN ASCENDENTE: menos ruedas = menor)
        if (this.ruedas.length < otro.ruedas.length) {
            return -1;  // ✅ CORREGIDO: era 1, ahora es -1
        } else if (this.ruedas.length > otro.ruedas.length) {  // ✅ CORREGIDO: añadido 'else'
            return 1;   // ✅ CORREGIDO: era -1, ahora es 1
        }
        
        // Comparamos diámetro de rueda (ORDEN ASCENDENTE: menor diámetro = menor)
        if (this.ruedas[0].getDiametroRueda() < otro.ruedas[0].getDiametroRueda()) {
            return -1;  // ✅ CORREGIDO: era 1, ahora es -1
        } else if (this.ruedas[0].getDiametroRueda() > otro.ruedas[0].getDiametroRueda()) {  // ✅ CORREGIDO: era '<', ahora es '>'
            return 1;   // ✅ CORREGIDO: era -1, ahora es 1
        }
        
        // Comparamos marca (orden alfabético)
        return this.marca.compareTo(otro.marca);
    }
    
    
    // ============ TOSTRING ============
    
    /**
     * Representación en texto del coche con formato tabular.
     * 
     * @return String formateado con la información del coche
     */
    @Override
    public String toString() {
        return String.format("\n-----------------\n"
                + "Marca: %s \n"
                + "Motor. CV: %d. %s\n" 
                + "Ruedas. Número: %d. Diámetro: %d. Tipo: %s",
                this.getMarca(), 
                this.motor.getCaballos(), 
                this.motor.getTipoGasolina(), 
                this.ruedas.length, 
                this.ruedas[0].getDiametroRueda(), 
                this.ruedas[0].getTipoRueda());
    }
}