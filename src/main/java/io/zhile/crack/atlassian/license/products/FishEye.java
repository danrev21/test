package io.zhile.crack.atlassian.license.products;

import io.zhile.crack.atlassian.license.LicenseProperty;

/**
 * @author pengzhile
 * @version 1.0
 * @link https://zhile.io
 */
public class FishEye extends LicenseProperty {
    public FishEye(String contactName, String contactEMail, String serverID, String organisation, boolean dataCenter) {
        super(contactName, contactEMail, serverID, organisation, dataCenter);
    }

    @Override
    public String getProductName() {
        return "fisheye";
    }
}
