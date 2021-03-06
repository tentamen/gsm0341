
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
    @ASN1BoxedType ( name = "CellIdDisc" )
    public class CellIdDisc implements IASN1PreparedElement {
                
        
        @ASN1Element ( name = "CellIdDisc", isOptional =  false , hasTag =  false  , hasDefaultValue =  false  )
    
        private CellIdDiscBase  value;        

        
        
        public CellIdDisc () {
        }
        
        
        
        public void setValue(CellIdDiscBase value) {
            this.value = value;
        }
        
        
        
        public CellIdDiscBase getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(CellIdDisc.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            