package ggc.app.partners;

import java.util.List;

import ggc.classes.Partner;

/** Messages for partner menu interactions. */
interface Message {

 /** @return string prompting for a partner identifier. */
  static String requestPartnerKey() {
    return "Identificador do parceiro: ";
  }

  /** @return string prompting for a partner name. */
  static String requestPartnerName() {
    return "Nome do parceiro: ";
  }

  /** @return string prompting for an address. */
  static String requestPartnerAddress() {
    return "Endereço do parceiro: ";
  }

  /** @return string prompting for a product identifier. */
  static String requestProductKey() {
    return "Identificador do produto: ";
  }

  /**
   * @param p partner to be shown
   * @return string describing the partner's attributes.
   */
  static String showPartner(Partner p) {
    return " " + p.getPartnerKey() + "| " + p.getName() +
      "|" + p.getStatus() +  "| " + Math.round(p.getPoints()) + 
      "| " + Math.round(p.getValueAcquisitions()) +
      "| " + Math.round(p.getValueSales()) + "| " + Math.round(p.getValuePaidSales());
  }

  static String showAllPartners(List<Partner> pList) {
    StringBuilder messageBuilder = new StringBuilder();
    pList.forEach(p -> messageBuilder.append(showPartner(p)));
    String message = messageBuilder.toString();
    
    return message;
  }
}
