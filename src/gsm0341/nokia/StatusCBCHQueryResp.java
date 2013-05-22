
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
    @ASN1Sequence ( name = "StatusCBCHQueryResp", isSet = false )
    public class StatusCBCHQueryResp implements IASN1PreparedElement {
            

       @ASN1PreparedElement
       @ASN1Sequence ( name = "cbchLoadingList" , isSet = false )
       public static class CbchLoadingListSequenceType implements IASN1PreparedElement {
                
        @ASN1Element ( name = "cellId", isOptional =  false , hasTag =  true, tag = 0 , hasDefaultValue =  false  )
    
	private Cell cellId = null;
                
  @ASN1Integer( name = "" )
    @ASN1ValueRangeConstraint ( 
		
		min = 0L, 
		
		max = 100L 
		
	   )
	   
        @ASN1Element ( name = "cbchLoading", isOptional =  false , hasTag =  true, tag = 1 , hasDefaultValue =  false  )
    
	private Integer cbchLoading = null;
                
  
        
        public Cell getCellId () {
            return this.cellId;
        }

        

        public void setCellId (Cell value) {
            this.cellId = value;
        }
        
  
        
        public Integer getCbchLoading () {
            return this.cbchLoading;
        }

        

        public void setCbchLoading (Integer value) {
            this.cbchLoading = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_CbchLoadingListSequenceType;
        }

       private static IASN1PreparedElementData preparedData_CbchLoadingListSequenceType = CoderFactory.getInstance().newPreparedElementData(CbchLoadingListSequenceType.class);
                
       }

       
                
@ASN1SequenceOf( name = "cbchLoadingList", isSetOf = false ) 

    
        @ASN1Element ( name = "cbchLoadingList", isOptional =  true , hasTag =  true, tag = 0 , hasDefaultValue =  false  )
    
	private java.util.Collection<CbchLoadingListSequenceType>  cbchLoadingList = null;
                
  

       @ASN1PreparedElement
       @ASN1Sequence ( name = "failureList" , isSet = false )
       public static class FailureListSequenceType implements IASN1PreparedElement {
                
        @ASN1Element ( name = "cellId", isOptional =  false , hasTag =  true, tag = 0 , hasDefaultValue =  false  )
    
	private Cell cellId = null;
                
  
        @ASN1Element ( name = "cause", isOptional =  false , hasTag =  true, tag = 1 , hasDefaultValue =  false  )
    
	private FailureReason cause = null;
                
  
        @ASN1Element ( name = "diagnostic", isOptional =  true , hasTag =  true, tag = 2 , hasDefaultValue =  false  )
    
	private DiagnosticInfo diagnostic = null;
                
  
        
        public Cell getCellId () {
            return this.cellId;
        }

        

        public void setCellId (Cell value) {
            this.cellId = value;
        }
        
  
        
        public FailureReason getCause () {
            return this.cause;
        }

        

        public void setCause (FailureReason value) {
            this.cause = value;
        }
        
  
        
        public DiagnosticInfo getDiagnostic () {
            return this.diagnostic;
        }

        
        public boolean isDiagnosticPresent () {
            return this.diagnostic != null;
        }
        

        public void setDiagnostic (DiagnosticInfo value) {
            this.diagnostic = value;
        }
        
  
                
                
        public void initWithDefaults() {
            
        }

        public IASN1PreparedElementData getPreparedData() {
            return preparedData_FailureListSequenceType;
        }

       private static IASN1PreparedElementData preparedData_FailureListSequenceType = CoderFactory.getInstance().newPreparedElementData(FailureListSequenceType.class);
                
       }

       
                
@ASN1SequenceOf( name = "failureList", isSetOf = false ) 

    
        @ASN1Element ( name = "failureList", isOptional =  true , hasTag =  true, tag = 1 , hasDefaultValue =  false  )
    
	private java.util.Collection<FailureListSequenceType>  failureList = null;
                
  
        @ASN1Element ( name = "channelIndicator", isOptional =  true , hasTag =  true, tag = 2 , hasDefaultValue =  false  )
    
	private Channel channelIndicator = null;
                
  
        
        public java.util.Collection<CbchLoadingListSequenceType>  getCbchLoadingList () {
            return this.cbchLoadingList;
        }

        
        public boolean isCbchLoadingListPresent () {
            return this.cbchLoadingList != null;
        }
        

        public void setCbchLoadingList (java.util.Collection<CbchLoadingListSequenceType>  value) {
            this.cbchLoadingList = value;
        }
        
  
        
        public java.util.Collection<FailureListSequenceType>  getFailureList () {
            return this.failureList;
        }

        
        public boolean isFailureListPresent () {
            return this.failureList != null;
        }
        

        public void setFailureList (java.util.Collection<FailureListSequenceType>  value) {
            this.failureList = value;
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

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(StatusCBCHQueryResp.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            