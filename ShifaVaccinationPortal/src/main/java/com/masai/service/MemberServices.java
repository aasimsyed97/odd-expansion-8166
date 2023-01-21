package com.masai.service;

import com.masai.exception.AadhaarCardException;
import com.masai.exception.IdCardException;
import com.masai.exception.MemberException;
import com.masai.exception.PanCardException;
import com.masai.model.Member;
import com.masai.model.VaccineRegistration;
public interface MemberServices {

   // public Member getMemberByld(String key,int idcardid) throws LoginException,MemberException,IdCardException;
    
    public Member getMemberByAdharNo(String adharno) throws MemberException,AadhaarCardException;
    
    public Member getMemberByPanNo(String panNo) throws MemberException,PanCardException;
    
   // public Member addMember(String key,Member member) throws LoginException,MemberException,VaccineRegistration;
    
   // public Member updateMember(String key,int idcardid,MemberUpdateDto MemberUpdateDto) throws LoginException,IdCardException,MemberException,VaccineRegistrationException;
    
   // public Member deleteMember(String key,int idcardid) throws LoginException,MemberException,IdCardException,VaccineRegistrationException;

}