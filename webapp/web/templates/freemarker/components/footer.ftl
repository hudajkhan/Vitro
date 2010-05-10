<#-- $This file is distributed under the terms of the license in /doc/license.txt$ -->

<div id="footer">
    
    <#if bannerImageUrl??>
        <img class="footerLogo" src="${urls.bannerImage}" alt="${tagline!}" />
    </#if>
            
    <div class="footerLinks">
        <ul class="otherNav">  
            <li <#if !urls.contact??>class="last"</#if>><a href="${urls.about}" title="more about this web site">About</a></li>
            <#if urls.contact??>    
                <li class="last"><a href="${urls.contact}" title="feedback form">Contact Us</a></li>
            </#if> 
        </ul>
    </div>
  
    <#include "copyright.ftl">

    All Rights Reserved. <a href="${urls.termsOfUse}">Terms of Use</a>

</div>

<#-- SCRIPT TAGS SHOULD GO HERE --> 