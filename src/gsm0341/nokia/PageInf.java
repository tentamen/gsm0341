
package gsm0341.nokia;
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
    @ASN1Sequence ( name = "PageInf", isSet = false )
    public class PageInf implements IASN1PreparedElement {
            @ASN1Integer( name = "" )
    @ASN1ValueRangeConstraint ( 
		
		min = 0L, 
		
		max = 82L 
		
	   )
	   
        @ASN1Element ( name = "messageInfoUsefulOctets", isOptional =  false , hasTag =  true, tag = 0 , hasDefaultValue =  false  )
    
	private Integer messageInfoUsefulOctets = null;
                
  
        @ASN1Element ( name = "messageInfoPage", isOptional =  false , hasTag =  true, tag = 1 , hasDefaultValue =  false  )
    
	private MessageInfoPage messageInfoPage = null;
                
  
        
        public Integer getMessageInfoUsefulOctets () {
            return this.messageInfoUsefulOctets;
        }

        

        public void setMessageInfoUsefulOctets (Integer value) {
            this.messageInfoUsefulOctets = value;
        }
        
  
        
        public MessageInfoPage getMessageInfoPage () {
            return this.messageInfoPage;
        }

        

        public void setMessageInfoPage (MessageInfoPage value) {
            this.messageInfoPage = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(PageInf.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            