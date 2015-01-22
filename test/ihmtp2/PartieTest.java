/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ihmtp2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class PartieTest {
    
    
    public PartieTest() {
        Partie p= new Partie();
        assertEquals(0,p.getNbcoups());
        assertEquals(0,p.getScoreA());
    }

    @Test
    public void testCooperer()
    {
          Partie p= new Partie();
          p.Cooperer(true,true);
          assertEquals(3,p.scoreA);
          assertEquals(3,p.scoreB);
          assertEquals(3,p.gainA);
          assertEquals(3,p.gainB);
         
          p.Cooperer(true,false);    
          assertEquals(0,p.gainA);
          assertEquals(5,p.gainB);
          assertEquals(3,p.scoreA);
          assertEquals(8,p.scoreB);
          
          p.Cooperer(false,true);    
          assertEquals(5,p.gainA);
          assertEquals(0,p.gainB);
          assertEquals(8,p.scoreA);
          assertEquals(8,p.scoreB);
          
           p.Cooperer(false,false);    
          assertEquals(1,p.gainA);
          assertEquals(1,p.gainB);
          assertEquals(9,p.scoreA);
          assertEquals(9,p.scoreB);
    }
    
    public void TestgetNbcoups(){
        Partie p= new Partie();
        p.Cooperer(true, true);
        assertEquals(0,p.getNbcoups());       
        
    }
    
    public void TestAaCooperer(){
        Partie p= new Partie();
        p.Cooperer(true, true);
        assertEquals(true,p.AaCooperer(1));
        p.Cooperer(false, true);
        assertEquals(false,p.AaCooperer(1));
        
    }
   
    public void TestBaCooperer(){
        Partie p= new Partie();
        p.Cooperer(true, true);
        assertEquals(true,p.BaCooperer(1));
         p.Cooperer(false, false);
        assertEquals(false,p.BaCooperer(1));
    }
     
    
}
