/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelConnect;

import ModelBeans.BeansConfig;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author Poseidom
 */
public class ConexaoTxt {
    
    BeansConfig mod = new BeansConfig();
    
     public void escrever(BeansConfig mod) throws IOException {
             // para fins de testes o caminho esta setado no Path diretamente porém o endereço irá ser adicionado através de uma variavel global
             // o software irá permitir que o usuario carregue vários perfis de configurações de bots 
        Path path = new File("C:\\Users\\lincoln\\Desktop\\openkore-master\\openkore-master\\control\\config.txt").toPath();
        String str = new String(Files.readAllBytes(path));
        try (BufferedWriter writer = Files.newBufferedWriter(path, Charset.forName("US-ASCII"))) {
            writer.write(
                    str
                            //alteração de config usando REGEX .*
                            .replaceAll("username.*", "username "+mod.getLogin())
                            .replaceFirst("password.*", "password "+mod.getSenha())
                            .replaceFirst("pin.*", "pin "+mod.getPin())
                            .replaceFirst("storageAuto_npc.*", "storageAuto_npc "+ mod.getStorageAutonpc())
                            .replaceFirst("storageAuto_password.*","storageAuto_password "+ mod.getStorageAuto_password())
                            .replaceFirst("saveMap.*", "saveMap "+mod.getSaveMap())
                            .replaceFirst("attackDistance.*", "attackAuto "+mod.getAttackAuto())
                            .replaceFirst("attackDistance.*", "attackDistance "+mod.getAttackDistMin())
                            .replaceFirst("attackMaxDistance.*", "attackDistance "+mod.getAttackDistMax())
                            .replaceFirst("attackAuto_inLockOnly.*", "attackAuto_inLockOnly "+mod.getLockMapOnly())
                            .replaceFirst("attackUseWeapon.*", "attackUseWeapon "+mod.getAttackUseWeapon())
                            .replaceFirst("attackDistanceAuto.*", "attackDistanceAuto "+mod.getAttackAuto())
                            .replaceFirst("lockMap.*", "lockMap "+ mod.getLockMap())
                            .replaceFirst("route_teleport.*", "route_teleport "+ mod.getTeleRoute())
                            .replaceFirst("route_teleport_maxTries.*", "route_teleport_maxTries "+mod.getMaxTries())


                            
                                    
                            
                            
                    
            );
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }
}
   
    

