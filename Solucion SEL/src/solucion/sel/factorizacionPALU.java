/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucion.sel;

/**
 *
 * @author monto
 */
public class factorizacionPALU {
    private float[][] matrizP;
    private float[][] matrizA;
    private float[][] matrizL;
    private float[][] matrizU;
    private float[] vectorB;

    public factorizacionPALU() {
    }
    
    public factorizacionPALU(float[][] P,float[][] A,float[][] L,float[][] U, float[] B){
        setMatrizP(P);
        setMatrizA(A);
        setMatrizL(L);
        setMatrizU(U);
        setVectorB(B);
    }
    
    private float[] multiplyPB(){
        float[] PB = new float[3];
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                PB[i] += matrizP[i][j]*vectorB[j];
            }
        }
        
        return PB;
    }
    
    private float[] multiplyLCPB(float[] PB){
        
        float[] vectorC = new float[3];
        
        vectorC[0] = PB[0];
        vectorC[1] = PB[1] - matrizL[1][0]*vectorC[0];
        vectorC[2] = PB[2] - matrizL[2][0]*vectorC[0] - matrizL[2][1]*vectorC[1];
        
        return vectorC;
    }
    
    private float[] multiplyUXC(float[] vectorC){
        float[] vectorX = new float[3];
        vectorX[2]= vectorC[2]/matrizU[2][2];
        vectorX[1]= (vectorC[1] - (matrizU[1][2]*vectorX[2]))/matrizU[1][1];
        vectorX[0]= (vectorC[0] -(matrizU[0][1]*vectorX[1])-(matrizU[0][2]*vectorX[2]))/matrizU[0][0];
        return vectorX;
    }
    
    public float[] solution(){
        float[] vectorX = multiplyUXC(multiplyLCPB(multiplyPB()));
        return vectorX;
    }

    /**
     * @return the matrizP
     */
    public float[][] getMatrizP() {
        return matrizP;
    }

    /**
     * @param matrizP the matrizP to set
     */
    public void setMatrizP(float[][] matrizP) {
        this.matrizP = matrizP;
    }

    /**
     * @return the vectorB
     */
    public float[] getVectorB() {
        return this.vectorB;
    }

    /**
     * @param vectorB the vectorB to set
     */
    public void setVectorB(float[] vectorB) {
        this.vectorB = vectorB;
    }

    /**
     * @return the matrizA
     */
    public float[][] getMatrizA() {
        return matrizA;
    }

    /**
     * @param matrizA the matrizA to set
     */
    public void setMatrizA(float[][] matrizA) {
        this.matrizA = matrizA;
    }

    /**
     * @return the matrizL
     */
    public float[][] getMatrizL() {
        return matrizL;
    }

    /**
     * @param matrizL the matrizL to set
     */
    public void setMatrizL(float[][] matrizL) {
        this.matrizL = matrizL;
    }

    /**
     * @return the matrizU
     */
    public float[][] getMatrizU() {
        return matrizU;
    }

    /**
     * @param matrizU the matrizU to set
     */
    public void setMatrizU(float[][] matrizU) {
        this.matrizU = matrizU;
    }
}
