package net.thucydides.productionvalidation.junit.pages;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import SupportLibraries.ExcelHelper;

@DefaultUrl("http://")


public class ValidationPage extends PageObject{
	
	static Map<String,String> inputData = ExcelHelper.GetData("1");
	
	public static String sDefaultURL = inputData.get("URL");
	
    @FindBy(xpath="//*[contains(text(),'Please wait while your changes are processed')]") WebElementFacade wait_txt;
    @FindBy(xpath="//input[@value='CMS']") WebElementFacade cms_tab;
    @FindBy(xpath="//input[contains(@id,'txtClaimSearch')]") WebElementFacade claim_txt;

    @FindBy(xpath="//input[contains(@id,'imgbtnClaimSearch')]") WebElementFacade claim_search_img; 
    
    @FindBy(xpath="//a[@title='Captioned Report']") WebElementFacade captioned_report_link;
    @FindBy(xpath="//input[contains(@id,'btClose')]") WebElementFacade captioned_report_close_btn;
    
    
    @FindBy(xpath="//a[@title='Cause Summary']") WebElementFacade cause_summary_link;
    @FindBy(xpath="//span[contains(@id,'lblftTotal')]") WebElementFacade cause_total_txt; 
    
    @FindBy(xpath="//a[contains(@id,'lnkMain')]") WebElementFacade return_to_main_claim_link;
    
    @FindBy(xpath="//input[contains(@id,'btnBiEvaluation')]") WebElementFacade bi_evaluation_btn;
    @FindBy(xpath="//input[contains(@id,'btnSaveMain')]") WebElementFacade bi_evaluation_save_btn;
    
    @FindBy(xpath="//img[contains(@src,'MedicalExpense')]/..") WebElementFacade medical_expense_tab;
    @FindBy(xpath="//input[contains(@id,'btnexport')]") WebElementFacade add_new_provider_btn;
    @FindBy(xpath="//input[contains(@id,'btnCancelCareProviders')]") WebElementFacade cancel_care_provider_btn;
    
    @FindBy(xpath="//img[contains(@src,'liability')]/..") WebElementFacade facts_liability_tab;
    @FindBy(xpath="//input[contains(@id,'btnSaveFacts')]") WebElementFacade facts_save_btn;
    
    @FindBy(xpath="//img[contains(@src,'injury')]/..") WebElementFacade injury_tab;
    @FindBy(xpath="//input[contains(@id,'btnCancelInjuryDetails')]") WebElementFacade injury_cancel_btn;
    
    @FindBy(xpath="//img[contains(@src,'Damages')]/..") WebElementFacade damages_settlement_tab;
    @FindBy(xpath="//input[contains(@id,'btnSaveGenDamages')]") WebElementFacade damages_save_btn;
    
    @FindBy(xpath="//img[contains(@src,'medicare')]/..") WebElementFacade medicare_tab;
    @FindBy(xpath="//img[contains(@src,'scheduleHS')]/..") WebElementFacade iso_date_btn;
    
    @FindBy(xpath="//img[contains(@src,'SupervisoryComent')]/..") WebElementFacade supervisory_comment_tab;
    @FindBy(xpath="//input[contains(@id,'btnCancelSupervisory')]") WebElementFacade supervisory_cancel_btn;
    
    @FindBy(xpath="//img[contains(@src,'Negotiations')]/..") WebElementFacade negotiations_tab;
    @FindBy(xpath="//input[contains(@id,'btnexporttoexcel')]") WebElementFacade add_negotiation_btn;
    @FindBy(xpath="//input[contains(@id,'btnCancel')]") WebElementFacade cancel_negotiation_btn; 
    
    
    @FindBy(xpath="//a[@title='CRU']") WebElementFacade cru_link;
    @FindBy(xpath="//input[contains(@id,'btnCancel')]") WebElementFacade cru_cancel_btn;
    
    @FindBy(xpath="//a[@title='Claimant List']") WebElementFacade claimant_list_link;
    
    @FindBy(xpath="//a[contains(@id,'lnkCOL')]") WebElementFacade cause_of_loss_link;
    @FindBy(xpath="//input[contains(@id,'btnSaveCause')]") WebElementFacade col_save_btn;
    
    @FindBy(xpath="//img[contains(@src,'Claimant')]/..") WebElementFacade claimant_tab;
    @FindBy(xpath="//input[contains(@id,'ClaimantSave')]") WebElementFacade claimant_save_btn;
    
    @FindBy(xpath="//img[contains(@src,'AdditionalInfo')]/..") WebElementFacade additional_info_tab;
    @FindBy(xpath="//input[contains(@id,'TxtSSN')]") WebElementFacade ssn_txt;
    
    @FindBy(xpath="//img[contains(@src,'ClaimantTransaction')]/..") WebElementFacade claimant_transaction_tab;
    @FindBy(xpath="//input[contains(@id,'btnExpExl')]") WebElementFacade export_to_excel_btn;
    
    @FindBy(xpath="//img[contains(@src,'AdditionalClaimants')]/..") WebElementFacade additional_claimants_tab;
    @FindBy(xpath="//div[contains(@id,'pnlACGrid')]") WebElementFacade add_additional_claimants_btn;
    @FindBy(xpath="//input[contains(@id,'btnACTCancel')]") WebElementFacade cancel_additional_claimants_btn;
    
    @FindBy(xpath="//img[contains(@src,'Coverage')]/..") WebElementFacade coverage_tab;
    @FindBy(xpath="//div[contains(@id,'PnlCoverage')]") WebElementFacade coverage_btn;
   // @FindBy(xpath="//input[contains(@id,'btnAQS')]") WebElementFacade aqs_btn;
    
    @FindBy(xpath="//img[contains(@src,'Viewdraft')]/..") WebElementFacade view_draft_tab;
    @FindBy(xpath="//a[contains(@id,'lnkDraftNumber')]") WebElementFacade draft_link;
    @FindBy(xpath="//input[contains(@id,'btnModify')]") WebElementFacade draft_save_btn;
    
    @FindBy(xpath="//img[contains(@src,'MainClaims')]/..") WebElementFacade main_claims_tab;
    @FindBy(xpath="//input[contains(@id,'btnUpdateClaim')]") WebElementFacade main_claims_save_btn;
    
    @FindBy(xpath="//img[contains(@src,'TaskList')]/..") WebElementFacade task_list_tab;
    @FindBy(xpath="//input[contains(@id,'ButtonAddManualTask')]") WebElementFacade add_task_btn;
    @FindBy(xpath="//input[contains(@id,'btnCancelTask')]") WebElementFacade cancel_task_btn;
    
    @FindBy(xpath="//a[@title='Correspondence']") WebElementFacade correspondence_list_link;
    @FindBy(xpath="//input[contains(@id,'btnGenerate')]") WebElementFacade generate_btn;
    
    @FindBy(xpath="//a[@title='Add Diary']") WebElementFacade add_diary_link;
    @FindBy(xpath="//input[contains(@id,'btnCancel')]") WebElementFacade add_diary_cancel_btn;
    @FindBy(xpath="//a[@title='View Diary']") WebElementFacade view_diary_link;
    @FindBy(xpath="//input[contains(@id,'txtFirstName')]") WebElementFacade first_name_txt;
    
    @FindBy(xpath="//a[@title='Add Documents']") WebElementFacade add_documents_link;
    @FindBy(xpath="//input[contains(@id,'btnSubmit')]") WebElementFacade document_submit_txt;
    @FindBy(xpath="//a[@title='View Documents']") WebElementFacade view_documents_link;
    @FindBy(xpath="//input[contains(@id,'imgbtnViewAllBookmarks')]") WebElementFacade filter_btn;
    
    @FindBy(xpath="//a[@title='DMV']") WebElementFacade dmv_link;
    @FindBy(xpath="//input[contains(@id,'txtLicenseState')]")  WebElementFacade license_state_txt;
    
    @FindBy(xpath="//a[@title='Involved Parties']") WebElementFacade involved_parties_link;
    @FindBy(xpath="//input[contains(@id,'txtLastName')]")  WebElementFacade last_name_txt;
    
    @FindBy(xpath="//a[@title='Litigation']") WebElementFacade litigation_link;
    @FindBy(xpath="//input[contains(@id,'txtState')]")  WebElementFacade litigation_state_txt;
    
    @FindBy(xpath="//a[@title='Add Notes']") WebElementFacade add_notes_link;
    @FindBy(xpath="//input[contains(@id,'btnCancelDown')]")  WebElementFacade cancel_add_notes_btn;
    @FindBy(xpath="//div[contains(@id,'PnlNotes')]")  WebElementFacade notes_txt;
    @FindBy(xpath="//a[@title='View Notes']") WebElementFacade view_notes_link;
    @FindBy(xpath="//a[contains(@id,'lnkbtnCollapseAll')]")  WebElementFacade collapse_view_notes_btn;
    
    @FindBy(xpath="//a[@title='Photos']") WebElementFacade photos_link;
    @FindBy(xpath="//input[contains(@id,'txtComments')]")  WebElementFacade photos_caption_btn;
    
    @FindBy(xpath="//a[@title='Recovery Transmittal']") WebElementFacade recovery_transmittal_link;
    @FindBy(xpath="//input[contains(@id,'btnAddRecovery')]")  WebElementFacade create_transmittal_btn;
    @FindBy(xpath="//textarea[contains(@id,'txtComments')]") WebElementFacade comment_txt;
    
    @FindBy(xpath="//a[@title='Reinsurance Recap']") WebElementFacade reinsurance_recap_link;
    @FindBy(xpath="//input[contains(@id,'txtClaim')]")  WebElementFacade rr_claim_txt;
    @FindBy(xpath="//img[contains(@src,'Detail')]/..") WebElementFacade detail_tab;
    @FindBy(xpath="//input[contains(@id,'txtClaimDetails')]")  WebElementFacade rd_claim_txt;
    
    @FindBy(xpath="//a[@title='Salvage']") WebElementFacade salvage_link;
    @FindBy(xpath="//input[contains(@id,'btnSalvage')]")  WebElementFacade go_to_salvage_btn;
    @FindBy(xpath="//input[contains(@id,'btnSave')]")  WebElementFacade salvage_details_save_btn;
    @FindBy(xpath="//img[contains(@src,'TLC')]/..") WebElementFacade tlc_tab;
    @FindBy(xpath="//input[contains(@id,'btnTotLossChkListSave')]")  WebElementFacade tlc_save_btn;
    
    @FindBy(xpath="//a[@title='SIU']") WebElementFacade siu_link;
    @FindBy(xpath="//div[contains(@id,'pnlFraudList')]")  WebElementFacade fraud_list_txt;
    @FindBy(xpath="//img[contains(@src,'RefertoSIU')]/..") WebElementFacade refer_to_siu_tab;
    @FindBy(xpath="//input[contains(@id,'btnRefertoSIU')]")  WebElementFacade refer_to_siu_btn;
    @FindBy(xpath="//img[contains(@src,'ReporttoISO')]/..") WebElementFacade report_to_nicb_tab;
    @FindBy(xpath="//input[contains(@id,'txtAgency')]")  WebElementFacade report_to_nicb_agency_txt;
    @FindBy(xpath="//img[contains(@src,'SIUActivity')]/..") WebElementFacade siu_activity_tab;
    @FindBy(xpath="//input[contains(@id,'imgDtSubToDA')]")  WebElementFacade siu_activity_date_img;
    
    @FindBy(xpath="//a[@title='Subpoena']") WebElementFacade subpoena_link;
    @FindBy(xpath="//input[contains(@id,'btnPrint')]")  WebElementFacade subpoena_print_btn;
    @FindBy(xpath="//a[@title='Subrogation']") WebElementFacade subrogation_link;
    @FindBy(xpath="//input[contains(@id,'btnPropUnit')]")  WebElementFacade subrogation_prop_btn;
    
    @FindBy(xpath="//a[@title='Fence Worksheet']") WebElementFacade fence_worksheet_link;
    @FindBy(xpath="//input[contains(@id,'btnSaveData')]")  WebElementFacade fence_worksheet_save_data_btn;
    
    @FindBy(xpath="//a[@title='New Claim']") WebElementFacade new_claim_link;
    @FindBy(xpath="//input[contains(@id,'btnSaveClaim')]")  WebElementFacade new_claim_save_btn;
    
    @FindBy(xpath="//a[@title='Search']") WebElementFacade search_link;
    @FindBy(xpath="//input[contains(@id,'btnSearchClaim')]")  WebElementFacade search_btn;
    
    //===========================METHODS==================================
    
    
    //Method to check whether browser is ready or not
    public void validateBrowserReady(){
    	boolean bflag=false;
    	while(!bflag){
    		String result = (String) evaluateJavascript("return document.readyState;");
    		if(result.equals("complete")){
    			bflag = true;
    		}else{
    			try{
    			Thread.sleep(3000);
    			}catch(Exception e){    				
    			}
    			bflag=false;
    		}
    	}
    }
    
    
    //Method to handle process dialog box - Wait until page loads
    public void processDialogs(){
    	try{
    		wait_txt.waitUntilVisible();       	
    	}catch(Exception e){    		
    	}
    	
    	try{
    	wait_txt.waitUntilNotVisible();
    	}catch(Exception e){    		
    	}
    	
    	boolean bflag = false;
    	while(!bflag){
    		try{
	    		if(wait_txt.isDisplayed()){
	    			bflag = false;
	    			Thread.sleep(2000);
	    		}else{
	    			bflag = true;
	    		}
    		}catch(Exception e){   
    			bflag = true;
    		}
    	}
    }
    
    //Method to handle Time outs
    public void waitForTimeout(int iTimeOut){
    	try{
    		Thread.sleep(iTimeOut);
    	}catch(Exception e){    		
    	}
    }
    
    //Method to make driver  to wait until Element is Visible
    public void waitUntilElementVisible(WebElementFacade objEle){
    	boolean bflag=false;
    	int i=0;
    	while(!bflag){
    		try{
    			i = i+1;
    			bflag = objEle.isDisplayed();
    		}catch(Exception e){
    			bflag = false;   
    			waitForTimeout(2000);
    			if(i==6) break;
    		}
    	}
    }
    
    //Method to make driver  to wait until Element is Visible
    public void clickWhenReady(WebElementFacade objEle){
    	boolean bflag=false;
    	int i=0;
    	while(!bflag){
    		try{
    			i = i+1;
    			bflag = objEle.waitUntilClickable();
    		}catch(Exception e){
    			bflag = false;   
    			waitForTimeout(2000);
    			if(i==7) break;
    		}
    	}
    }
    

   
    public void gotoCMSPage(){    	
		try{
			waitUntilElementVisible(cms_tab);
			cms_tab.waitUntilClickable();
			cms_tab.click();
		}catch(Exception e){    				
		}
		validateBrowserReady();	
	}	
    
    
    public void enterClaimNumber(String sClaimNumber){
    	waitForTimeout(2000);
		waitUntilElementVisible(claim_txt);
		claim_txt.waitUntilVisible();
    	claim_txt.sendKeys(sClaimNumber);
    }
    
    
    public void clickOnSearch(){
    	validateBrowserReady();
    	waitUntilElementVisible(claim_search_img);
    	claim_search_img.waitUntilVisible();
    	claim_search_img.waitUntilClickable();
    	claim_search_img.click();
    }
    
    
    public void clickOnCaptionedReportLink(){
    	validateBrowserReady();
    	waitUntilElementVisible(captioned_report_link);
    	captioned_report_link.waitUntilVisible();
    	clickWhenReady(captioned_report_link);
    	//captioned_report_link.click();
    	evaluateJavascript("document.getElementById('ctl00_IdSiteMap_treeLeftMenut9').click();");
    	waitForTimeout(5000);
    	withTimeoutOf(120, TimeUnit.SECONDS).waitFor(ExpectedConditions.numberOfWindowsToBe(2));
    	Object[] arrWindows = getDriver().getWindowHandles().toArray();
    	getDriver().switchTo().window(arrWindows[1].toString());    		
    	waitForTimeout(12000);
    	validateBrowserReady();
    	waitUntilElementVisible(captioned_report_close_btn);
    	waitUntilElementVisible(captioned_report_close_btn);
    	captioned_report_close_btn.waitUntilVisible();
    	//evaluateJavascript("document.getElementById('ctl00_SPWebPM_CaptionReportWP1_ctl00_btClose').click();");
    	getDriver().switchTo().window(arrWindows[1].toString()).close();
    	withTimeoutOf(500, TimeUnit.SECONDS).waitFor(ExpectedConditions.numberOfWindowsToBe(1));
    	getDriver().switchTo().window(arrWindows[0].toString());
    	waitForTimeout(5000);
    	System.out.println("clickOnCaptionedReportLink Passed");
    }
    

    public void clickOnCauseSummaryLink() throws InterruptedException{
    	validateBrowserReady();
    	waitUntilElementVisible(cause_summary_link);
    	cause_summary_link.waitUntilVisible();
    	cause_summary_link.waitUntilClickable();
    	cause_summary_link.click();
    	validateBrowserReady();
    	waitUntilElementVisible(cause_total_txt);
    	cause_total_txt.waitUntilVisible();	
    }
    
    
    public void clickOnCRULink() throws Exception{
    	validateBrowserReady();
    	waitUntilElementVisible(cru_link);
    	cru_link.waitUntilVisible();
    	cru_link.waitUntilClickable();
    	cru_link.click();
    	validateBrowserReady();
    	waitUntilElementVisible(cru_cancel_btn);
    	cru_cancel_btn.waitUntilVisible();
    }
    
    
    public void clickOnClaimantListLink(){
    	waitUntilElementVisible(claimant_list_link);
    	claimant_list_link.waitUntilClickable();
        claimant_list_link.click();
        validateBrowserReady();
        waitUntilElementVisible(cause_of_loss_link);
        waitUntilElementVisible(cause_of_loss_link);
    	cause_of_loss_link.waitUntilClickable();
    	cause_of_loss_link.click();
    	processDialogs();   	
    }
    
    
    public void goToCauseListTab(){
    	validateBrowserReady();
    	waitUntilElementVisible(col_save_btn);
    	col_save_btn.waitUntilVisible();
    }
    
    
    public void goToAdditionalInfoTab(){
    	waitUntilElementVisible(additional_info_tab);
    	additional_info_tab.waitUntilClickable();
    	additional_info_tab.click();
    	processDialogs();
    	ssn_txt.waitUntilVisible();
    }
    
    
    public void goToAdditionalClaimantsTab(){
    	waitUntilElementVisible(additional_claimants_tab);
    	additional_claimants_tab.waitUntilVisible();
    	additional_claimants_tab.waitUntilClickable();
    	additional_claimants_tab.click();
    	processDialogs();
    	waitUntilElementVisible(add_additional_claimants_btn);
    	add_additional_claimants_btn.waitUntilVisible();
    	add_additional_claimants_btn.waitUntilClickable();
/*    	clickWhenReady(add_additional_claimants_btn);
    	add_additional_claimants_btn.click();
    	processDialogs();
    	validateBrowserReady();
    	waitUntilElementVisible(cancel_additional_claimants_btn);    	
    	cancel_additional_claimants_btn.waitUntilVisible();*/
    }
    
    
    public void goToClaimantTransactionTab() throws Exception{
    	waitUntilElementVisible(claimant_transaction_tab);
    	claimant_transaction_tab.waitUntilClickable();
    	claimant_transaction_tab.click();
    	processDialogs();
    	validateBrowserReady();
    	waitUntilElementVisible(export_to_excel_btn);
    	export_to_excel_btn.waitUntilVisible();
    }
    
    
    public void goToClaimantTab(){
    	validateBrowserReady();
    	waitUntilElementVisible(claimant_tab);
    	claimant_tab.waitUntilClickable();
    	claimant_tab.click();
    	processDialogs();
    	waitUntilElementVisible(bi_evaluation_btn);
    	bi_evaluation_btn.waitUntilClickable();
    	bi_evaluation_btn.click();
	    processDialogs();
    	validateBrowserReady();
    	waitUntilElementVisible(bi_evaluation_save_btn);
    	bi_evaluation_save_btn.waitUntilVisible();
    }
    
    
    public void clickOnMedicalExpensesTab(){
    	validateBrowserReady();
    	waitUntilElementVisible(medical_expense_tab);
    	medical_expense_tab.waitUntilVisible();
    	medical_expense_tab.waitUntilClickable();
    	medical_expense_tab.click();
    	processDialogs();
    	add_new_provider_btn.waitUntilVisible();
    	add_new_provider_btn.waitUntilClickable();
    	processDialogs();
    }
    
    
    public void clickOnFactsTab(){
    	validateBrowserReady();
    	waitUntilElementVisible(facts_liability_tab);
    	facts_liability_tab.waitUntilVisible();
    	facts_liability_tab.waitUntilClickable();
    	facts_liability_tab.click();
    	try{
    		Thread.sleep(1500);
    		getDriver().switchTo().alert().accept();
    		Thread.sleep(1500);
    	}catch(Exception e){
    		
    	}
    	processDialogs();
    	waitUntilElementVisible(facts_save_btn);
    	facts_save_btn.waitUntilVisible();
    }
    
    
    public void clickOnInjuryTab(){
    	waitUntilElementVisible(injury_tab);
    	injury_tab.waitUntilVisible();
    	injury_tab.waitUntilClickable();
    	injury_tab.click();
    	processDialogs();
    	validateBrowserReady();
    	waitUntilElementVisible(injury_cancel_btn);
    	injury_cancel_btn.waitUntilVisible();
    }
    
    
    public void clickOnDamagesTab(){
    	waitUntilElementVisible(damages_settlement_tab);
    	damages_settlement_tab.waitUntilVisible();
    	damages_settlement_tab.waitUntilClickable();
    	damages_settlement_tab.click();
    	processDialogs();
    	validateBrowserReady();
    	waitUntilElementVisible(damages_save_btn);
    	damages_save_btn.waitUntilVisible();
    }
    
    
    public void clickOnMedicareTab(){
    	waitUntilElementVisible(medicare_tab);
    	medicare_tab.waitUntilVisible();
    	medicare_tab.waitUntilClickable();
    	medicare_tab.click();
    	processDialogs();
    	validateBrowserReady();
    	waitUntilElementVisible(iso_date_btn);
    	iso_date_btn.waitUntilVisible();
    }
    
    
    public void clickOnSupervisoryCommentTab(){
    	waitUntilElementVisible(supervisory_comment_tab);
    	supervisory_comment_tab.waitUntilVisible();
    	supervisory_comment_tab.waitUntilClickable();
    	supervisory_comment_tab.click();
    	processDialogs();
    	validateBrowserReady();
    	waitUntilElementVisible(supervisory_cancel_btn);
    	supervisory_cancel_btn.waitUntilVisible();
    	
    }
    
    public void clickOnNegotiationsTab(){
    	waitUntilElementVisible(negotiations_tab);
    	negotiations_tab.waitUntilVisible();
    	negotiations_tab.waitUntilClickable();
    	negotiations_tab.click();
    	processDialogs();
    	validateBrowserReady();
    	waitUntilElementVisible(add_negotiation_btn);
    	add_negotiation_btn.waitUntilVisible();
    	processDialogs();
    }
    
    	
    public void clickOnCoverageTab(){
    	validateBrowserReady();
    	waitUntilElementVisible(claimant_list_link);
    	claimant_list_link.waitUntilVisible();
    	claimant_list_link.waitUntilClickable();
        claimant_list_link.click();
        validateBrowserReady();
    	waitUntilElementVisible(coverage_tab);
    	coverage_tab.waitUntilVisible();
        coverage_tab.waitUntilClickable();
    	coverage_tab.click();
    	processDialogs();
    	validateBrowserReady();
    	waitUntilElementVisible(coverage_btn);
    	coverage_btn.waitUntilVisible();  
    	waitForTimeout(5000);
    }
    
    
    public void clickOnViewDraft(){	
        validateBrowserReady();
    	waitUntilElementVisible(view_draft_tab);
    	view_draft_tab.waitUntilVisible();
    	view_draft_tab.waitUntilClickable();
    	view_draft_tab.click();
    	processDialogs();
    	validateBrowserReady();
    	waitUntilElementVisible(draft_link);
    	draft_link.waitUntilVisible();
    }
    
    
    public void clickOnTaskListTab(){
    	waitUntilElementVisible(task_list_tab);
    	task_list_tab.waitUntilClickable();
    	task_list_tab.click();
    	processDialogs();
    	waitUntilElementVisible(add_task_btn);
    	add_task_btn.waitUntilVisible();

    }
    

    public void clickOnMainClaimsTab(){
    	validateBrowserReady();
    	waitUntilElementVisible(main_claims_tab);
    	main_claims_tab.waitUntilVisible();
    	main_claims_tab.waitUntilClickable();
    	main_claims_tab.click();
    	processDialogs();
    	waitUntilElementVisible(main_claims_save_btn);
    	main_claims_save_btn.waitUntilVisible();
    }
    
   
    public void clickOnCorrespondenceLink()  throws Exception{
    	validateBrowserReady();
    	waitUntilElementVisible(correspondence_list_link);
    	correspondence_list_link.waitUntilVisible();
    	correspondence_list_link.waitUntilClickable();
    	correspondence_list_link.click();
    	validateBrowserReady();
    	waitUntilElementVisible(generate_btn);
    	generate_btn.waitUntilClickable(); 
    }
    
    
    public void clickOnAddDiaryLink() throws Exception{
    	validateBrowserReady();
    	waitUntilElementVisible(add_diary_link);
    	add_diary_link.waitUntilClickable();
    	add_diary_link.click();
    	processDialogs();
    	validateBrowserReady();
    	waitUntilElementVisible(add_diary_cancel_btn);
    	add_diary_cancel_btn.waitUntilVisible();
    }
    
    
    public void clickOnViewDiaryLink(){
    	waitUntilElementVisible(view_diary_link);
    	view_diary_link.waitUntilVisible();
    	view_diary_link.waitUntilClickable();
    	view_diary_link.click();
    	validateBrowserReady();
    	waitUntilElementVisible(first_name_txt);
    	first_name_txt.waitUntilVisible();
    }
    
    
    public void clickOnAddDocumentsLink(){
    	waitUntilElementVisible(add_documents_link);
    	add_documents_link.waitUntilVisible();
    	clickWhenReady(add_documents_link);
    	add_documents_link.waitUntilClickable();
    	add_documents_link.click();
    	validateBrowserReady();
    	waitUntilElementVisible(document_submit_txt);
    	document_submit_txt.waitUntilVisible();
    }
    
    
    public void clickOnViewDocumentsLink(){
    	waitUntilElementVisible(view_documents_link);
    	view_documents_link.waitUntilVisible();
    	view_documents_link.waitUntilClickable();
    	view_documents_link.click();
    	validateBrowserReady();
    	waitUntilElementVisible(filter_btn);
    	filter_btn.waitUntilVisible();
    }
    

    public void clickOnDMVLink(){
    	waitUntilElementVisible(dmv_link);
    	dmv_link.waitUntilClickable();
    	dmv_link.click();
    	waitUntilElementVisible(license_state_txt);
    	waitUntilElementVisible(license_state_txt);
    	license_state_txt.waitUntilVisible();
    }
    
    
    public void clickOnInvolvedPartiesLink(){
    	waitUntilElementVisible(involved_parties_link);
    	involved_parties_link.waitUntilClickable();
    	involved_parties_link.click();   
    	validateBrowserReady();
    	waitUntilElementVisible(last_name_txt);
    	last_name_txt.waitUntilVisible();
    }
    
    
    public void clickOnLitigationLink() {
    	waitUntilElementVisible(litigation_link);
    	litigation_link.waitUntilClickable();
    	litigation_link.click();
    	validateBrowserReady();
    	waitUntilElementVisible(litigation_state_txt);
    	litigation_state_txt.waitUntilVisible();
    }
    
    
    public void clickOnAddNotesLink() {
    	validateBrowserReady();
    	waitUntilElementVisible(add_notes_link);
    	clickWhenReady(add_notes_link);
    	//add_notes_link.click();
    	evaluateJavascript("document.getElementById('ctl00_IdSiteMap_treeLeftMenut26').click();");
    	waitForTimeout(5000);
    	withTimeoutOf(120, TimeUnit.SECONDS).waitFor(ExpectedConditions.numberOfWindowsToBe(2));
	    Object[] arrWindows = getDriver().getWindowHandles().toArray();
	    System.out.println("clickOnAddNotesLink - Number of windows :"+arrWindows.length);
	    getDriver().switchTo().window(arrWindows[1].toString());
	    waitForTimeout(12000);
	    validateBrowserReady();
	    waitUntilElementVisible(cancel_add_notes_btn);
	    waitUntilElementVisible(cancel_add_notes_btn);
	    cancel_add_notes_btn.waitUntilVisible();
	//    evaluateJavascript("document.getElementById('ctl00_SPWebPM_AddNotesWP1_ctl00_btnCancelDown').isDisplayed();");  
    	getDriver().switchTo().window(arrWindows[1].toString()).close(); 	
    	withTimeoutOf(500, TimeUnit.SECONDS).waitFor(ExpectedConditions.numberOfWindowsToBe(1));
    	getDriver().switchTo().window(arrWindows[0].toString());
    	waitForTimeout(5000);
    	System.out.println("Add Notes Passed");
    }
    
    
    public void clickOnViewNotesLink() {
    	validateBrowserReady();
    	waitUntilElementVisible(view_notes_link);
    	view_notes_link.waitUntilClickable();
    	view_notes_link.click();
	    validateBrowserReady();
	    waitUntilElementVisible(collapse_view_notes_btn);
	    collapse_view_notes_btn.waitUntilVisible();
    }
    
    
    public void clickOnPhotosLink() {
    	waitUntilElementVisible(photos_link);
    	photos_link.waitUntilClickable();
    	photos_link.click();
    	validateBrowserReady();
    	waitUntilElementVisible(photos_caption_btn);
    	photos_caption_btn.waitUntilVisible();
    }
    
    
    public void clickOnRecoveryTransmittalLink() {
    	waitUntilElementVisible(recovery_transmittal_link);
    	recovery_transmittal_link.waitUntilClickable();
    	recovery_transmittal_link.click();
    	validateBrowserReady();
    	waitUntilElementVisible(create_transmittal_btn);
    	create_transmittal_btn.waitUntilVisible();
    	/*create_transmittal_btn.waitUntilClickable();
    	create_transmittal_btn.click();
    	processDialogs();
    	waitUntilElementVisible(comment_txt);
    	comment_txt.waitUntilVisible();*/
    }
    
    
    public void clickOnReinsuranceRecapLink(){
    	validateBrowserReady();
    	waitUntilElementVisible(reinsurance_recap_link);
    	reinsurance_recap_link.waitUntilClickable();
    	reinsurance_recap_link.click();
    	validateBrowserReady();
    	waitUntilElementVisible(rr_claim_txt);
    	rr_claim_txt.waitUntilVisible();
    	detail_tab.waitUntilClickable();
    	detail_tab.click();
    	validateBrowserReady();
    	waitUntilElementVisible(rd_claim_txt);
    	rd_claim_txt.waitUntilVisible();
    }
    
    
    public void clickOnSalvageLink(){
    	validateBrowserReady();
    	waitUntilElementVisible(salvage_link);
    	salvage_link.waitUntilVisible();
    	clickWhenReady(salvage_link);
    	//salvage_link.click();
    	evaluateJavascript("document.getElementById('ctl00_IdSiteMap_treeLeftMenut31').click();");
    	waitForTimeout(12000);
    	withTimeoutOf(120, TimeUnit.SECONDS).waitFor(ExpectedConditions.numberOfWindowsToBe(2));
	    Object[] arrWindows = getDriver().getWindowHandles().toArray();
	    System.out.println("clickOnSalvageLink - Number of windows :"+arrWindows.length);
	    getDriver().switchTo().window(arrWindows[1].toString());
	    waitForTimeout(15000);
	    validateBrowserReady();
	    waitUntilElementVisible(go_to_salvage_btn);
	    waitUntilElementVisible(go_to_salvage_btn);
	    go_to_salvage_btn.waitUntilVisible();
	    go_to_salvage_btn.waitUntilEnabled();
	    go_to_salvage_btn.waitUntilClickable();
    	evaluateJavascript("document.getElementById('ctl00_SPWebPM_ClaimantPopUpWP1_ctl00_btnSalvage').click();");
    	withTimeoutOf(500, TimeUnit.SECONDS).waitFor(ExpectedConditions.numberOfWindowsToBe(1));
    	getDriver().switchTo().window(arrWindows[0].toString());
    	waitForTimeout(6000);
    	System.out.println("salvage Passed");
    	validateBrowserReady();
    	waitUntilElementVisible(salvage_details_save_btn);
    	salvage_details_save_btn.waitUntilVisible();
    	tlc_tab.waitUntilVisible();
    	tlc_tab.waitUntilClickable();
    	tlc_tab.click();
    	processDialogs();
    	validateBrowserReady();
    	waitUntilElementVisible(tlc_save_btn);
    	tlc_save_btn.waitUntilVisible();
    }
    
    
    public void clickOnSIULink(){
    	validateBrowserReady();
    	waitUntilElementVisible(siu_link);
    	siu_link.waitUntilClickable();
    	siu_link.click();
        processDialogs();
    	validateBrowserReady();
    	waitUntilElementVisible(fraud_list_txt);
    	fraud_list_txt.waitUntilVisible();
        waitUntilElementVisible(refer_to_siu_tab);
    	refer_to_siu_tab.waitUntilClickable();
    	refer_to_siu_tab.click();
    	processDialogs();
    	validateBrowserReady();
    	waitUntilElementVisible(refer_to_siu_btn);
    	refer_to_siu_btn.waitUntilVisible();
    	waitUntilElementVisible(report_to_nicb_tab);
    	report_to_nicb_tab.waitUntilClickable();
    	report_to_nicb_tab.click();
    	processDialogs();
    	validateBrowserReady();
    	waitUntilElementVisible(report_to_nicb_agency_txt);
    	report_to_nicb_agency_txt.waitUntilVisible();
    	waitUntilElementVisible(siu_activity_tab);
    	siu_activity_tab.waitUntilClickable();
    	siu_activity_tab.click();
    	processDialogs();
    	validateBrowserReady();
    	waitUntilElementVisible(siu_activity_date_img);
    	siu_activity_date_img.waitUntilVisible();
    }
    
    
    public void clickOnSubpoenaLink(){
    	validateBrowserReady();
    	waitUntilElementVisible(subpoena_link);
    	subpoena_link.waitUntilVisible();
    	subpoena_link.waitUntilClickable();
    	subpoena_link.click();
    	validateBrowserReady();
    	waitUntilElementVisible(subpoena_print_btn);
    	subpoena_print_btn.waitUntilVisible();
    }
    
    
    public void clickOnSubrogationLink(){
    	validateBrowserReady();
    	waitUntilElementVisible(subrogation_link);
    	waitForTimeout(15000);
    	subrogation_link.waitUntilVisible();
    	subrogation_link.waitUntilClickable();
    	subrogation_link.click();
    	validateBrowserReady();
    	waitUntilElementVisible(subrogation_prop_btn);
    	subrogation_prop_btn.waitUntilVisible();
    }
    
    
    public void clickOnFenceWorkSheetLink() {
    	validateBrowserReady();
    	waitUntilElementVisible(fence_worksheet_link);
    	fence_worksheet_link.waitUntilClickable();
    	fence_worksheet_link.click();
    	validateBrowserReady();
    	waitUntilElementVisible(fence_worksheet_save_data_btn);
    	fence_worksheet_save_data_btn.waitUntilVisible();
    }
    
    
    public void clickOnNewClaimLink() {
    	waitUntilElementVisible(new_claim_link);
    	new_claim_link.waitUntilClickable();
    	new_claim_link.click();
    	validateBrowserReady();
    	waitUntilElementVisible(new_claim_save_btn);
    	new_claim_save_btn.waitUntilVisible();
    }
    
    
    public void clickOnSearchLink() {
    	waitUntilElementVisible(search_link);
    	search_link.waitUntilClickable();
    	search_link.click();
    	validateBrowserReady();
    	waitUntilElementVisible(search_btn);
    	search_btn.waitUntilVisible();
    }
    
    
}
