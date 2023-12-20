/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessModel.Role;

import BusinessModel.Enterprise.Enterprise;
import BusinessModel.Organization.Organization;
import javax.swing.JPanel;
import BusinessModel.EcoSystem;

import BusinessModel.Organization.DisasterHelpProviderOrganization;
import BusinessModel.Organization.Organization;
import BusinessModel.UserAccount.UserAccount;
import UserInterface.DisasterHelpProviderOrganisationAdmin.DisasterHelpProviderOrganisationAdminWorkArea;
import UserInterface.EmergencyAssistanceOrganisationAdmin.EmergencyAssistanceOrganisationAdminWorkArea;


/**
 *
 * @author HM
 */
public class EmergencyAssistanceOrganisationAdminRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,EcoSystem system){
        return new EmergencyAssistanceOrganisationAdminWorkArea(userProcessContainer,/*account,(ChangeMakerOrganization)organization,*/enterprise/*,system*/);
    }   
        @Override
        public String toString()
{
   return Role.RoleType.EmergencyAssistanceOrganisationAdminRole.getValue();
}
    
}







