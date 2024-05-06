package com.cucumber.stepDefinitions;
import com.cucumber.pageObject.Myrentokil_POC;

import io.cucumber.datatable.internal.difflib.myers.MyersDiff;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class rentokil_Stepdefinitions {
	Myrentokil_POC rentokil=new Myrentokil_POC();
	
	@Given("I launch a Live web application")
	public void i_launch_a_live_web_application() {
		rentokil.lauchTheBrowser();
	}

	@Then("I have enter user details for login in Live")
	public void i_have_enter_user_details_for_login_in_live() throws Exception {
		Thread.sleep(3000);
	   rentokil.enterLoginDetails();
	}

	@Then("I need to select the country from dropdown list")
	public void i_need_to_select_the_country_from_dropdown_list() {
	rentokil.countrySelection();
	}

	@Then("I click on Login as me in live URL")
	public void i_click_on_Login_as_me_in_live_URL() {
	rentokil.loginAsMe();
	}

	@Then("I click on myService button now")
	public void i_click_on_my_service_button_now() {
	   rentokil.servicePage();
	}

	@Then("I am in the Site overview page now")
	public void i_am_in_the_site_overview_page_now() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("^I click on \"([^\"]*)\" to see details now in live$")
	public void i_click_on_to_see_details(String site_name) throws Throwable {
		rentokil.siteName(site_name);
	}
	

	@Then("I am in the Site summary page now")
	public void i_am_in_the_site_summary_page_now() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I click on Recommendations from menu now")
	public void i_click_on_recommendations_from_menu_now() {
	    rentokil.recommendationPage();
	}

	@Then("I am in the Recommendations page now")
	public void i_am_in_the_recommendations_page_now() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I click on Visit from menu now")
	public void i_click_on_visit_from_menu_now() {
	    rentokil.visitpage();
	}

	@Then("I am in the Visit page now")
	public void i_am_in_the_visit_page_now() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I click on Visit details from menu now")
	public void i_click_on_visit_details_from_menu_now() {
	   rentokil.visitDetailsPage();
	}

	@Then("I am in the Visit details page now")
	public void i_am_in_the_visit_details_page_now() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I click on jobs from menu now")
	public void i_click_on_jobs_from_menu_now() {
	   rentokil.jobsPage();
	}

	@Then("I am in the jobs page now")
	public void i_am_in_the_jobs_page_now() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I click on pest activity from menu now")
	public void i_click_on_pest_activity_from_menu_now() {
	    rentokil.pestactivityPage();
	}

	@Then("I am in the pest activity page now")
	public void i_am_in_the_pest_activity_page_now() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I click on Recommendations details from menu now")
	public void i_click_on_recommendations_details_from_menu_now() {
	   rentokil.recommendationdetailsPage();
	}

	@Then("I am in the Recommendations details page now")
	public void i_am_in_the_recommendations_details_page_now() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I click on preparation from menu now")
	public void i_click_on_preparation_from_menu_now() {
	    rentokil.preparationPage();
	}

	@Then("I am in the preparation page now")
	public void i_am_in_the_preparation_page_now() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I click on tasks from menu now")
	public void i_click_on_tasks_from_menu_now() {
	    rentokil.tasksPage();
	}

	@Then("I am in the tasks page now")
	public void i_am_in_the_tasks_page_now() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I click on tasks details from menu now")
	public void i_click_on_tasks_details_from_menu_now() {
	    rentokil.taskdetailsPage();
	}

	@Then("I am in the tasks details page now")
	public void i_am_in_the_tasks_details_page_now() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I click on site plans from menu now")
	public void i_click_on_site_plans_from_menu_now() {
	   rentokil.sitePlansPage();
	}

	@Then("I am in the site plans page now")
	public void i_am_in_the_site_plans_page_now() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I click on documents from menu now")
	public void i_click_on_documents_from_menu_now() {
	    rentokil.documentsPage();
	}

	@Then("I am in the documents page now")
	public void i_am_in_the_documents_page_now() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I click on support from menu now")
	public void i_click_on_support_from_menu_now() {
	   rentokil.supportPage();
	}

	@Then("I am in the support page now")
	public void i_am_in_the_support_page_now() {
	   
	}

	@Then("I click on accounts from menu now")
	public void i_click_on_accounts_from_menu_now() {
	    rentokil.accountsPage();
	}

	@Then("I am in the accounts page now")
	public void i_am_in_the_accounts_page_now() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I click on reports from menu now")
	public void i_click_on_reports_from_menu_now() {
	   rentokil.report_reportPage();
	}

	@Then("I am in the reports page now")
	public void i_am_in_the_reports_page_now() {
	    
	}

	@Then("I click on Recommendations analysis in report page from menu now")
	public void i_click_on_recommendations_analysis_in_report_page_from_menu_now() {
	    rentokil.recommendationAnalysisPage();
	}

	@Then("I am in the Recommendations analysis in report page page now")
	public void i_am_in_the_recommendations_analysis_in_report_page_page_now() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I click on pest analysis from menu now")
	public void i_click_on_pest_analysis_from_menu_now() {
	   rentokil.reportsPage_pestAnalysis();
	}

	@Then("I am in the pest analysis page now")
	public void i_am_in_the_pest_analysis_page_now() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I click on site collection from menu now")
	public void i_click_on_site_collection_from_menu_now() {
	   rentokil.sitecollectionPage();
	}

	@Then("I am in the site collection page now")
	public void i_am_in_the_site_collection_page_now() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("I logout")
	public void i_Logout() {
	   rentokil.logout();
	    
	}

}
