package android.telephony;

import android.content.Context;
import android.content.ContentResolver;
import android.provider.Settings;
import android.annotation.SuppressLint;
import androidx.annotation.NonNull;

import android.telephony.TelephonyManager;
import android.telephony.TelephonyScanManager;
import android.telephony.SubscriptionManager;
import android.telephony.SubscriptionInfo;

/**
 * @hide
 */
@SuppressLint("UnflaggedApi")
public class SpoofSim {

    private SpoofSim() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }

    /**
     * @hide
     */
    private static @NonNull String getSpoofSetting(String value){
        ContentResolver cr = android.app.ActivityThread.currentApplication().getContentResolver();
        return Settings.Global.getString(cr, value);
    }

    /**
     * @hide
     */
    @SuppressLint("UnflaggedApi")
    public static @NonNull boolean getSpoofStatus(){
        try {
            return Boolean.parseBoolean(getSpoofSetting( "spoof_status"));
        } catch (Exception e) {

        }
        return false;
    }

    /**
     * @hide
     * Use{@link SubscriptionInfo#getIccId()}
     */
    @SuppressLint("UnflaggedApi")
    public static @NonNull String spoofIccId(){
        try {
            return getSpoofSetting( "spoof_iccid") != null ? getSpoofSetting( "spoof_iccid") : "01234567890123456789";
        } catch (Exception e) {

        }
        return "01234567890123456789";
    }

    /**
     * @hide
     * Use{@link SubscriptionInfo#getNumber()}
     * Use{@link SubscriptionManager#getPhoneNumber(int)}
     * Use{@link SubscriptionManager#getPhoneNumber(int, int)}
     * Use{@link TelephonyManager#getLine1Number(int)}
     * Use{@link TelephonyManager#getVoiceMailNumber(int)}
     */
    @SuppressLint("UnflaggedApi")
    public static @NonNull String spoofSimNumber(){
        try {
            return getSpoofSetting( "spoof_simnumber") != null ? getSpoofSetting( "spoof_simnumber") : "0123456789";
        } catch (Exception e) {
            // TODO: handle exception
        }
        return "0123456789";
    }

    /**
     * @hide
     * Use{@link SubscriptionInfo#getSimSlotIndex()}
     * Use{@link SubscriptionManager#getSlotIndex(int)}
     */
    @SuppressLint("UnflaggedApi")
    public static @NonNull int spoofSimSlotIndex(){
        try {
            return Integer.parseInt(getSpoofSetting( "spoof_simslotindex"));
        } catch (Exception e) {
            // TODO: handle exception
        }
        return 0;
    }

    /**
     * @hide
     * Use{@link Use{@link SubscriptionInfo#getCarrierId()}}
     * Use{@link TelephonyManager#getSimCarrierId() }
     * Use{@link TelephonyManager#getSimSpecificCarrierId() }
     * Use{@link SubscriptionManager#getPhoneId(int) }
     */
    @SuppressLint("UnflaggedApi")
    public static @NonNull int spoofCarrierId(){
        try {
            return Integer.parseInt(getSpoofSetting( "spoof_simcarrierid"));
        } catch (Exception e) {
            // TODO: handle exception
        }
        return 0;
    }


    /**
     * @hide
     * Use{@link SubscriptionInfo#getCountryIso() }
     * Use{@link TelephonyManager#getNetworkCountryIso()}
     * Use{@link TelephonyManager#getNetworkCountryIso(int)}
     * Use{@link TelephonyManager#getSimCountryIso(int)}
     * Use{@link TelephonyManager#getSimCountryIsoForPhone(int)}
     */
    @SuppressLint("UnflaggedApi")
    public static @NonNull String spoofCountryIso(){
        try {
            return getSpoofSetting( "spoof_countryiso") != null ? getSpoofSetting( "spoof_countryiso") : "us";
        } catch (Exception e) {
            // TODO: handle exception
        }
        return "us";
    }

    /**
     * @hide
     * Use{@link SubscriptionManager#getActiveSubscriptionInfoForSimSlotIndex(int)}
     */
    @SuppressLint("UnflaggedApi")
    public static @NonNull SubscriptionInfo customSubscripInfo(){
        return new SubscriptionInfo(
            0,
            "1234", 
            0, 
            "mat", 
            "mat", 
            0, 
            0, 
            "1234567890", 
            0, 
            null, 
            "1234567890", 
            "1234567890", 
            "us", 
            false, 
            null, 
            "1234567890");
    }

    /**
     * @hide
     * Use{@link TelephonyManager#getPhoneCount()}
     * Use{@link TelephonyManager#getActiveModemCount()}
     */
    @SuppressLint("UnflaggedApi")
    public static @NonNull int spoofPhoneCount(){
        try {
            return Integer.parseInt(getSpoofSetting( "spoof_phonecount"));
        } catch (Exception e) {
            // TODO: handle exception
        }
        return 1;
    }


    /**
     * @hide
     * Use{@link TelephonyManager#getImei()}
     * Use{@link TelephonyManager#getImei(int)}
     * Use{@link TelephonyManager#getDeviceId()}
     * Use{@link TelephonyManager#getDeviceId(int)}
     */
    @SuppressLint("UnflaggedApi")
    public static @NonNull String spoofImei(){
        try {
            return getSpoofSetting( "spoof_imei") != null ? getSpoofSetting( "spoof_imei") : "012345678912345";
        } catch (Exception e) {
            // TODO: handle exception
        }
        return "012345678912345";
    }


    /**
     * @hide
     * Use{@link TelephonyManager#getMeid()}
     * Use{@link TelephonyManager#getMeid(int)}
     */
    @SuppressLint("UnflaggedApi")
    public static @NonNull String spoofMeid(){
        try {
            return getSpoofSetting( "spoof_meid") != null ? getSpoofSetting( "spoof_meid") : "012345678912345";
        } catch (Exception e) {
            // TODO: handle exception
        }
        return "012345678912345";
    }

    /**
     * @hide
     * Use{@link TelephonyManager#getNetworkOperator()}
     * Use{@link TelephonyManager#getNetworkOperator(int)}
     * Use{@link TelephonyManager#getSimOperator()}
     * Use{@link TelephonyManager#getSimOperator(int)}
     * Use{@link TelephonyManager#getSimOperatorNumeric()}
     * Use{@link TelephonyManager#getSimOperatorNumeric(int)}
     * Use{@link TelephonyManager#getSimOperatorNumericForPhone(int)}
     */
    @SuppressLint("UnflaggedApi")
    public static @NonNull String spoofOperator(){
        try {
            return getSpoofSetting( "spoof_operator") != null ? getSpoofSetting( "spoof_operator") : "12345";
        } catch (Exception e) {
            // TODO: handle exception
        }
        return "12345";
    }

    /**
     * @hide
     * Use{@link TelephonyManager#getNetworkOperatorName(int)}
     * Use{@link TelephonyManager#getNetworkOperatorForPhone(int)}
     * Use{@link TelephonyManager#getSimOperatorName()}
     * Use{@link TelephonyManager#getSimOperatorName(int)}
     * Use{@link TelephonyManager#getSimOperatorNameForPhone(int)}
     */
    @SuppressLint("UnflaggedApi")
    public static @NonNull String spoofOperatorName(){
        try {
            return getSpoofSetting( "spoof_operatorname") != null ? getSpoofSetting( "spoof_operatorname") : "mat";
        } catch (Exception e) {
            // TODO: handle exception
        }
        return "mat";
    }

    /**
     * @hide
     * Use{@link TelephonyManager#getSimSerialNumber()}
     * Use{@link TelephonyManager#getSimSerialNumber(int)}
     */
    @SuppressLint("UnflaggedApi")
    public static @NonNull String spoofSimSerialNumber(){
        try {
            return getSpoofSetting( "spoof_simserialnumber") != null ? getSpoofSetting( "spoof_simserialnumber") : "8912345678901234567";
        } catch (Exception e) {
            // TODO: handle exception
        }
        return "8912345678901234567";
    }

    /**
     * @hide
     * Use{@link TelephonyManager#getSubscriberId()}
     * Use{@link TelephonyManager#getSubscriberId(int)}
     */
    @SuppressLint("UnflaggedApi")
    public static @NonNull String spoofSubscriberId(){
        try {
            return getSpoofSetting( "spoof_subscriberid") != null ? getSpoofSetting( "spoof_subscriberid") : "8912345678901234567";
        } catch (Exception e) {
            // TODO: handle exception
        }
        return "8912345678901234567";
    }

    /**
     * @hide
     * Use{@link TelephonyManager#getSubId()}
     * Use{@link TelephonyManager#getSubId(int)}
     */
    @SuppressLint("UnflaggedApi")
    public static @NonNull int spoofSubId(){
        try {
            return Integer.parseInt(getSpoofSetting( "spoof_subid"));
        } catch (Exception e) {
            // TODO: handle exception
        }
        return 1;
    }
}
