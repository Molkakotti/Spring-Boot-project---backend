package com.membre.Membre.controller;

import com.membre.Membre.Entities.Membre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MemberRestController {
    @Autowired
    IMemberService memberService;
    @RequestMapping(value="/membres", method= RequestMethod.GET)
    public List<Membre> findMembres (){
        return memberService.findAll();
    }
    @GetMapping(value="/membre/{id}") //direct na3tih l id
    public Membre findOneMemberById(@PathVariable Long id){
        return memberService.findMember(id);
    }
    @GetMapping(value="/membre/search/cin")
    public Membre findOneMemberByCin(@RequestParam String cin)
    {
        return memberService.findByCin(cin);
    }
    @GetMapping(value="/membre/search/email")
    public Membre findOneMemberByEmail(@RequestParam String email)
    {
        return memberService.findByEmail(email);
    }


}
