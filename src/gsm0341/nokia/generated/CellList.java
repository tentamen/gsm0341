
package gsm0341.nokia.generated;
//
// This file was generated by the BinaryNotes compiler.
// See http://bnotes.sourceforge.net 
// Any modifications to this file will be lost upon recompilation of the source ASN.1. 
//

import org.bn.*;
import org.bn.annotations.*;
import org.bn.annotations.constraints.*;
import org.bn.coders.*;
import org.bn.types.*;




    @ASN1PreparedElement
    @ASN1Sequence ( name = "CellList", isSet = false )
    public class CellList implements IASN1PreparedElement {
            
        @ASN1Element ( name = "disc", isOptional =  false , hasTag =  true, tag = 0 , hasDefaultValue =  false  )
    
	private CellIdListDisc disc = null;
                
  

       @ASN1PreparedElement
       @ASN1Sequence ( name = "cellList" , isSet = false )
       public static class CellListSequenceType implements IASN1PreparedElement {
                
        @ASN1Element ( name = "id", isOptional =  false , hasTag =  true, tag = 1 , hasDefaultValue =  false  )
    
	private CellId id = null;
                
  
        
        public CellId getId () {
            return this.id;
        }

        

        public void setId (CellId value) {
            this.id = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_CellListSequenceType;
        }

       private static IASN1PreparedElementData preparedData_CellListSequenceType = CoderFactory.getInstance().newPreparedElementData(CellListSequenceType.class);
                
       }

       
                
@ASN1SequenceOf( name = "cellList", isSetOf = false ) 

    
        @ASN1Element ( name = "cellList", isOptional =  true , hasTag =  true, tag = 1 , hasDefaultValue =  false  )
    
	private java.util.Collection<CellListSequenceType>  cellList = null;
                
  
        
        public CellIdListDisc getDisc () {
            return this.disc;
        }

        

        public void setDisc (CellIdListDisc value) {
            this.disc = value;
        }
        
  
        
        public java.util.Collection<CellListSequenceType>  getCellList () {
            return this.cellList;
        }

        
        public boolean isCellListPresent () {
            return this.cellList != null;
        }
        

        public void setCellList (java.util.Collection<CellListSequenceType>  value) {
            this.cellList = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(CellList.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            