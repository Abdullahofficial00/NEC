import React from 'react';
import FooterDetail from './FooterDetail';
import './Footer.css';
import { FaInstagram,FaLinkedin,FaFacebook } from 'react-icons/fa';

const Footer = () => {
    const noNamed = [
        { name: "Online Oppointment", link: "/appointment" },
        { name: "Emergency Health Care", link: "/emergency" },
        { name: "Check Up", link: "/checkup" },
        { name: "Treatment of Personal Diseases", link: "/personal-treatment" },
        
    ]
    const ourAddress = [
        { name: "DHA Phase-6 Lahore", link: "//google.com/map" },
    ]
    const oralHealth = [
        { name: "Emergency Dental Care", link: "/emergency" },
        { name: "Check Up", link: "/checkup" },
        { name: "Tooth Extraction", link: "/tooth-extract" },
        
    ]
    const services = [
         { name: "Online Oppointment", link: "/appointment" },
        { name: "Emergency Health Care", link: "/emergency" },
        { name: "Check Up", link: "/checkup" },
        { name: "Treatment of Personal Diseases", link: "/personal-treatment" },
        
    ]

    return (
        <footer className="footer-area clear-both sm-pe-5">
            <div className="container pt-5">
                <div className="row md-py-5 footer-content">
                    {/* <FooterDetail key={1} menuTitle={"."} menuItems={noNamed} /> */}
                    <FooterDetail key={2} menuTitle="Services" menuItems={services} />
                    <FooterDetail key={3} menuTitle="Oral Health" menuItems={oralHealth} />
                    <FooterDetail key={4} menuTitle="Our Address" menuItems={ourAddress}>
                    <div>
                        <ul>
                            <li className="list-inline-item"><a href="https://www.facebook.com/rayanrasheed" target="_blank" rel="noopener noreferrer"><FaFacebook /></a></li>
                            <li className="list-inline-item"><a href="https://www.instagram.com/rayanrasheed786" target="_blank" rel="noopener noreferrer"><FaInstagram /></a></li>
                            <li className="list-inline-item"><a href="https://linktr.ee/rayanrasheed" target="_blank" rel="noopener noreferrer"><FaLinkedin /></a></li>
                        </ul>
                    </div>

                    
                    </FooterDetail>
                </div>
                <div className="copyRight text-center"> 
                    <p>Copyright {(new Date()).getFullYear()} All Rights be Reserved</p>
                </div>
            </div>
        </footer>
    );
};

export default Footer;