package net.thucydides.productionvalidation.junit.steps;


import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import SupportLibraries.AuthenticationHelper;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.productionvalidation.junit.pages.ValidationPage;


public class VALIDATESteps extends ScenarioSteps {
	
    ValidationPage validationPage;

    
    @Step
    public void opens_home_page() {    	
/*    	AuthenticationHelper objAuthenticationHelper = new AuthenticationHelper();
    	try{
    		
    		getDriver().navigate().to(ValidationPage.sDefaultURL);
    		System.out.println("login started");	
    		//objAuthenticationHelper.LoginAuthentication();
    		System.out.println("login completed");	
    		Properties prop = new Properties();
    		prop.load(new FileInputStream("serenity.properties"));
    		System.out.println("---------- : "+prop.getProperty("webdriver.driver"));
    		if(prop.getProperty("webdriver.driver").equals("chrome")){
    			objAuthenticationHelper.LoginAuthentication();
    			System.out.println("login completed");	
			}else if(prop.getProperty("webdriver.driver").equals("firefox")){
				//objAuthenticationHelper.LoginAuthentication();
				System.out.println("login completed");	
			}    		
    	}catch(Exception e){    		
    		System.out.println("---------- : Login Exception");
    		objAuthenticationHelper.LoginAuthentication();
			System.out.println("login completed");			
    	}finally{
    		getDriver().manage().window().maximize();
			getDriver().manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);	
    	}*/
    	
    	getDriver().navigate().to(ValidationPage.sDefaultURL);
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);	
    	

    }
    
    @Step
    public void click_on_cms_tab() {
    	validationPage.gotoCMSPage();
   
    }
    
    @Step
    public void enter_claim_number(String sClaimNumber) {
    	validationPage.enterClaimNumber(sClaimNumber);
   
    }
    
    @Step
    public void click_on_search_btn() {
    	validationPage.clickOnSearch();
    }
    
    
    @Step
    public void click_on_medical_expense_tab() {
    	validationPage.clickOnMedicalExpensesTab();
    }
    
    @Step
    public void click_on_facts_tab() {
    	validationPage.clickOnFactsTab();
    }
    
    @Step
    public void click_on_injury_tab() {
    	validationPage.clickOnInjuryTab();
    }
    
    @Step
    public void click_on_damages_tab() {
    	validationPage.clickOnDamagesTab();
    }
    
    @Step
    public void click_on_medicare_tab() {
    	validationPage.clickOnMedicareTab();
    }
    
    @Step
    public void click_on_supervisory_comment_tab() {
    	validationPage.clickOnSupervisoryCommentTab();
    }
    
    @Step
    public void click_on_negotiations_tab() {
    	validationPage.clickOnNegotiationsTab();
    }
    
    @Step
    public void click_on_captioned_report_link() {
    	validationPage.clickOnCaptionedReportLink();
    }
    
    @Step
    public void click_on_cause_summary_link() throws InterruptedException {
    	validationPage.clickOnCauseSummaryLink();
    }
    
    @Step
    public void click_on_cru_link() throws Exception {
    	validationPage.clickOnCRULink();
    }
    
    @Step
    public void click_on_claimat_list_link()  {
    	validationPage.clickOnClaimantListLink();
    }
    
    @Step
    public void click_on_cause_list_tab()  {
    	validationPage.goToCauseListTab();
    }
    
    @Step
    public void click_on_additional_info_tab()  {
    	validationPage.goToAdditionalInfoTab();
    }
    
    @Step
    public void click_on_additional_claimants_tab()  {
    	validationPage.goToAdditionalClaimantsTab();
    }
    
    @Step
    public void click_on_claimant_transaction_tab() throws Exception  {
    	validationPage.goToClaimantTransactionTab();
    }
    
    @Step
    public void click_on_claimants_tab()  {
    	validationPage.goToClaimantTab();
    }
    
    @Step
    public void click_on_coverage_tab()  {
    	validationPage.clickOnCoverageTab();
    }
    
    @Step
    public void click_on_view_draft_tab()  {
    	validationPage.clickOnViewDraft();
    }
    
    @Step
    public void click_on_task_list_tab()  {
    	validationPage.clickOnTaskListTab();
    }
    
    @Step
    public void click_on_main_claims_tab()  {
    	validationPage.clickOnMainClaimsTab();
    }
    
    @Step
    public void click_on_correnspondence_list_link()  throws Exception {
    	validationPage.clickOnCorrespondenceLink();
    }

    @Step
    public void click_on_add_dairy_list_link() throws Exception{
    	validationPage.clickOnAddDiaryLink();
    }
    
    @Step
    public void click_on_view_dairy_list_link() {
    	validationPage.clickOnViewDiaryLink();
    }
    
    @Step
    public void click_on_add_documents_link() {
    	validationPage.clickOnAddDocumentsLink();
    }
    
    @Step
    public void click_on_view_documents_link() {
    	validationPage.clickOnViewDocumentsLink();
    }
    
    @Step
    public void click_on_dmv_link() {
    	validationPage.clickOnDMVLink();
    }
    
    @Step
    public void click_on_involved_parties_link()  {
    	validationPage.clickOnInvolvedPartiesLink();
    }
    
    @Step
    public void click_on_litigation_link()  {
    	validationPage.clickOnLitigationLink();
    }
    
    @Step
    public void click_on_add_notes_link()  {
    	validationPage.clickOnAddNotesLink();
    }
    
    
    @Step
    public void click_on_view_notes_link()  {
    	validationPage.clickOnViewNotesLink();
    }
    
    
    @Step
    public void click_on_photos_link()  {
    	validationPage.clickOnPhotosLink();
    }
    
    @Step
    public void click_on_recovery_transmittal_link()  {
    	validationPage.clickOnRecoveryTransmittalLink();
    }
    
    @Step
    public void click_on_reinsurance_recap_link() {
    	validationPage.clickOnReinsuranceRecapLink();
    }
    
    @Step
    public void click_on_salvage_link() {
    	validationPage.clickOnSalvageLink();
    }
    
    
    @Step
    public void click_on_SIU_link() {
    	validationPage.clickOnSIULink();
    }
    
    @Step
    public void click_on_Subpoena_link(){
    	validationPage.clickOnSubpoenaLink();
    }
    
    @Step
    public void click_on_Subrogation_link() {
    	validationPage.clickOnSubrogationLink();
    }
    
    @Step
    public void click_on_fence_worksheet_link() {
    	validationPage.clickOnFenceWorkSheetLink();
    }
    
    @Step
    public void click_on_new_claim_link() {
    	validationPage.clickOnNewClaimLink();
    }
    
    @Step
    public void click_on_search_link() {
    	validationPage.clickOnSearchLink();
    }

}
