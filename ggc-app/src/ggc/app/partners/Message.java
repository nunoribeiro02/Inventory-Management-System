package ggc.app.partners;

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
    return "Partner Key: " + p.getPartnerKey() + "Name: " + p.getName() + "\n" +
      "Status: " + p.getStatus() +  "Points: " + Math.round(p.getPoints()) + "\n" +
      "Value Acquisitions: " + Math.round(p.getValueAcquisitions()) + "\n"+ 
      "Value Sales: " + Math.round(p.getValueSales()) + "Value Paid Sales: " + Math.round(p.getValuePaidSales());
  }


}
