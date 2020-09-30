/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logan.lewis2
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Genomes {
    /* A gene starts with ATG and can end with TAG, TAA, or TGA (whichever comes first).
     * The length of a gene string is a multiple of 3, and the gene does not contain any of the triples ATG, TAG, TAA, or TGA.
     * 
     */
    public static ArrayList<String> findGenes(String genomeString) {       
        String Gene = "";
        ArrayList<String> GeneList = new ArrayList<String>(); 
        int i = 0;
        while (i < genomeString.length() - 2) {
            
            if (genomeString.charAt(i) == 'A' && genomeString.charAt(i+1) == 'T' && genomeString.charAt(i+2) == 'G') {      // Starts a gene
                if (genomeString.indexOf("TAA") > 0 && genomeString.indexOf("TAG") > 0 && genomeString.indexOf("TGA") > 0) {        // All three endings present.
                    if (genomeString.indexOf("TAA") < genomeString.indexOf("TAG") && genomeString.indexOf("TAA") < genomeString.indexOf("TGA")) {
                        Gene = genomeString.substring(genomeString.indexOf("ATG") + 3, (genomeString.indexOf("TAA")));
                        if (Gene.length() % 3 == 0) {
                            GeneList.add(new String(Gene));
                        }
                        i = genomeString.indexOf("TAA") + 3;
                        genomeString = genomeString.substring(i,genomeString.length());
                        i = -1;
                    }
                    else if (genomeString.indexOf("TAG") < genomeString.indexOf("TAA") && genomeString.indexOf("TAG") < genomeString.indexOf("TGA")) {
                        Gene = genomeString.substring(genomeString.indexOf("ATG") + 3, (genomeString.indexOf("TAG")));
                        if (Gene.length() % 3 == 0) {
                            GeneList.add(new String(Gene));
                        }
                        i = genomeString.indexOf("TAG") + 3;
                        genomeString = genomeString.substring(i,genomeString.length());
                        i = -1;
                    }
                    else if (genomeString.indexOf("TGA") < genomeString.indexOf("TAG") && genomeString.indexOf("TGA") < genomeString.indexOf("TAA")) {
                        Gene = genomeString.substring(genomeString.indexOf("ATG") + 3, (genomeString.indexOf("TGA")));
                        if (Gene.length() % 3 == 0) {
                            GeneList.add(new String(Gene));
                        }
                        i = genomeString.indexOf("TGA") + 3;
                        genomeString = genomeString.substring(i,genomeString.length());
                        i = -1;
                    }
                }
                else if (genomeString.indexOf("TAA") > 0 && genomeString.indexOf("TAG") > 0 && genomeString.indexOf("TGA") < 0) {       // TAA and TAG present.
                    if (genomeString.indexOf("TAA") < genomeString.indexOf("TAG")) {
                        Gene = genomeString.substring(genomeString.indexOf("ATG") + 3, (genomeString.indexOf("TAA")));
                        if (Gene.length() % 3 == 0) {
                            GeneList.add(new String(Gene));
                        }
                        i = genomeString.indexOf("TAA") + 3;
                        genomeString = genomeString.substring(i,genomeString.length());
                        i = -1;
                    }
                    else {
                        Gene = genomeString.substring(genomeString.indexOf("ATG") + 3, (genomeString.indexOf("TAG"))); 
                        if (Gene.length() % 3 == 0) {
                            GeneList.add(new String(Gene));
                        }
                        i = genomeString.indexOf("TAG") + 3;
                        genomeString = genomeString.substring(i,genomeString.length());
                        i = -1;
                    }
                }
                else if (genomeString.indexOf("TAA") < 0 && genomeString.indexOf("TAG") > 0 && genomeString.indexOf("TGA") > 0) {       // TGA and TAG present.
                    if (genomeString.indexOf("TAG") < genomeString.indexOf("TGA")) {
                        Gene = genomeString.substring(genomeString.indexOf("ATG") + 3, (genomeString.indexOf("TAG")));
                        if (Gene.length() % 3 == 0) {
                            GeneList.add(new String(Gene));
                        }
                        i = genomeString.indexOf("TAG") + 3;
                        genomeString = genomeString.substring(i,genomeString.length());
                        i = -1;
                    }
                    else {
                        Gene = genomeString.substring(genomeString.indexOf("ATG") + 3, (genomeString.indexOf("TGA")));
                        if (Gene.length() % 3 == 0) {
                            GeneList.add(new String(Gene));
                        }
                        i = genomeString.indexOf("TGA") + 3;
                        genomeString = genomeString.substring(i,genomeString.length());
                        i = -1;
                    }
                }
                else if (genomeString.indexOf("TAA") > 0 && genomeString.indexOf("TAG") < 0 && genomeString.indexOf("TGA") > 0) {   // TAA and TGA present.
                    if (genomeString.indexOf("TAA") < genomeString.indexOf("TGA")) {
                        Gene = genomeString.substring(genomeString.indexOf("ATG") + 3, (genomeString.indexOf("TAA")));
                        if (Gene.length() % 3 == 0) {
                            GeneList.add(new String(Gene));
                        }
                        i = genomeString.indexOf("TAA") + 3;
                        genomeString = genomeString.substring(i,genomeString.length());
                        i = -1;
                    }
                    else {
                        Gene = genomeString.substring(genomeString.indexOf("ATG") + 3, (genomeString.indexOf("TGA")));
                        if (Gene.length() % 3 == 0) {
                            GeneList.add(new String(Gene));
                        }
                        i = genomeString.indexOf("TGA") + 3;
                        genomeString = genomeString.substring(i,genomeString.length());
                        i = -1;
                    }
                }
                else if (genomeString.indexOf("TAA") > 0 && genomeString.indexOf("TAG") < 0 && genomeString.indexOf("TGA") < 0) {       // TAA present.
                    Gene = genomeString.substring(genomeString.indexOf("ATG") + 3, (genomeString.indexOf("TAA")));
                    if (Gene.length() % 3 == 0) {
                        GeneList.add(new String(Gene));
                    }
                    i = genomeString.indexOf("TAA") + 3;
                    genomeString = genomeString.substring(i,genomeString.length());
                    i = -1;
                }
                else if (genomeString.indexOf("TAA") < 0 && genomeString.indexOf("TAG") > 0 && genomeString.indexOf("TGA") < 0) {       // TAG present.
                    Gene = genomeString.substring(genomeString.indexOf("ATG") + 3, (genomeString.indexOf("TAG")));
                    if (Gene.length() % 3 == 0) {
                        GeneList.add(new String(Gene));
                    }
                    i = genomeString.indexOf("TAG") + 3;
                    genomeString = genomeString.substring(i,genomeString.length());
                    i = -1;
                }
                else if (genomeString.indexOf("TAA") < 0 && genomeString.indexOf("TAG") < 0 && genomeString.indexOf("TGA") > 0) {       // TGA present.
                    Gene = genomeString.substring(genomeString.indexOf("ATG") + 3, (genomeString.indexOf("TGA")));
                    if (Gene.length() % 3 == 0) {
                        GeneList.add(new String(Gene));
                    }
                    i = genomeString.indexOf("TGA") + 3;
                    genomeString = genomeString.substring(i,genomeString.length());
                    i = -1;
                }
            }
            i++;
        }
        return GeneList;
    }
    
    public static void main(String[] args) {        // Accepts a genome string and returns any genes found, otherwise returns "No gene is found".
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a genome String: "); // use "TTATGTTTTAAGGATGGGGCGTTAGTGAT" and "TGTGTGTATAT".
        String Genome = input.next();
        
        System.out.println();
        
        if(findGenes(Genome).isEmpty()) {
            System.out.println("No genes were found in this sequence.");
        }
        else {
            for (int i = 0; i < findGenes(Genome).size(); i++) {
                System.out.println(findGenes(Genome).get(i));      // should return "TTT" and "GGGCGT" for the first string, and "No genes found" for the second.
            }
        }
    }
}
