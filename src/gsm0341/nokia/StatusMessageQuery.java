
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
    @ASN1Sequence ( name = "StatusMessageQuery", isSet = false )
    public class StatusMessageQuery implements IASN1PreparedElement {
            @ASN1Integer( name = "" )
    @ASN1ValueRangeConstraint ( 
		
		min = 0L, 
		
		max = 65535L 
		
	   )
	   
        @ASN1Element ( name = "messageIdentifier", isOptional =  false , hasTag =  true, tag = 0 , hasDefaultValue =  false  )
    
	private Integer messageIdentifier = null;
                
  
        @ASN1Element ( name = "currentSerialNo", isOptional =  false , hasTag =  true, tag = 1 , hasDefaultValue =  false  )
    
	private SerialNumber currentSerialNo = null;
                
  
        @ASN1Element ( name = "cellList", isOptional =  false , hasTag =  true, tag = 2 , hasDefaultValue =  false  )
    
	private CellList cellList = null;
                
  
        @ASN1Element ( name = "channelIndicator", isOptional =  true , hasTag =  true, tag = 3 , hasDefaultValue =  false  )
    
	private Channel channelIndicator = null;
                
  
        
        public Integer getMessageIdentifier () {
            return this.messageIdentifier;
        }

        

        public void setMessageIdentifier (Integer value) {
            this.messageIdentifier = value;
        }
        
  
        
        public SerialNumber getCurrentSerialNo () {
            return this.currentSerialNo;
        }

        

        public void setCurrentSerialNo (SerialNumber value) {
            this.currentSerialNo = value;
        }
        
  
        
        public CellList getCellList () {
            return this.cellList;
        }

        

        public void setCellList (CellList value) {
            this.cellList = value;
        }
        
  
        
        public Channel getChannelIndicator () {
            return this.channelIndicator;
        }

        
        public boolean isChannelIndicatorPresent () {
            return this.channelIndicator != null;
        }
        

        public void setChannelIndicator (Channel value) {
            this.channelIndicator = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(StatusMessageQuery.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            