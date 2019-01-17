Feature: Check if the scrum delete works
	As Sapientia scrum tool user I want to be able to delete a story  
  
   Scenario: DeleteFirst
   Given I delete the scrum list's first story
   When I select the first element in  the title textbox and I push the delete button
   Then it should be deleted from the stories list