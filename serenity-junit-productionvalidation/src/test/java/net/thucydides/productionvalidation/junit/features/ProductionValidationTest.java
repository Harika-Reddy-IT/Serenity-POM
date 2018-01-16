package net.thucydides.productionvalidation.junit.features;

import java.util.Map;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.Steps;
import net.thucydides.productionvalidation.junit.steps.VALIDATESteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import SupportLibraries.AuthenticationHelper;
import SupportLibraries.ExcelHelper;

@RunWith(SerenityRunner.class)
public class ProductionValidationTest {
	
    @Managed
    WebDriver driver;

    @Steps
    VALIDATESteps validate;
    
    @Test
    @Screenshots(disabled=true)
    
    public void production_validation()  throws Exception{
    	
    	
    	Map<String,String> inputData = ExcelHelper.GetData("1");
    	validate.opens_home_page();  
    	validate.click_on_cms_tab();
    	validate.enter_claim_number(inputData.get("AutoType"));
    	validate.click_on_search_btn();
     	validate.click_on_captioned_report_link();
    	validate.click_on_cause_summary_link();
    	validate.click_on_cru_link();
    	validate.click_on_claimat_list_link();
    	validate.click_on_cause_list_tab();
    	validate.click_on_additional_info_tab();
    	validate.click_on_additional_claimants_tab();
    	validate.click_on_claimant_transaction_tab();
    	validate.click_on_claimants_tab();
    	validate.click_on_medical_expense_tab();
    	validate.click_on_facts_tab();
    	validate.click_on_injury_tab();
    	validate.click_on_damages_tab();
    	validate.click_on_medicare_tab();
    	validate.click_on_supervisory_comment_tab();
    	validate.click_on_negotiations_tab();
    	validate.click_on_coverage_tab();
        validate.click_on_view_draft_tab();
    	validate.click_on_task_list_tab();
    	validate.click_on_main_claims_tab();
    	validate.click_on_correnspondence_list_link();
    	validate.click_on_add_dairy_list_link();
    	validate.click_on_view_dairy_list_link();
    	validate.click_on_add_documents_link();
    	validate.click_on_view_documents_link();
    	validate.click_on_dmv_link();
    	validate.click_on_involved_parties_link();
    	validate.click_on_litigation_link();
    	validate.click_on_add_notes_link();
    	validate.click_on_view_notes_link();
    	validate.click_on_photos_link();
    	validate.click_on_recovery_transmittal_link();
    	validate.click_on_reinsurance_recap_link();
    	validate.click_on_salvage_link();
    	validate.click_on_SIU_link();
    	validate.click_on_Subpoena_link();
    	validate.click_on_Subrogation_link();
    	validate.enter_claim_number(inputData.get("PropertyType"));
    	validate.click_on_search_btn();
    	validate.click_on_fence_worksheet_link();
    	validate.click_on_new_claim_link();
    	validate.click_on_search_link();
    }


}
