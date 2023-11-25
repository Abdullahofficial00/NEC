import React from 'react';
import Appointment from '../components/home/Appointment/Appointment';
import Blog from '../components/home/Blog/Blog';
import Contact from '../components/home/Contact/Contact';
import Doctor from '../components/home/Doctor/Doctor';
import FeaturedService from '../components/home/FeaturedService/FeaturedService';
import Footer from '../components/Shared/Footer/Footer';
import Header from '../components/home/Header/Header';
import Services from '../components/home/Services/Services';
import Testimonial from '../components/home/Testimonial/Testimonial';

const Home = () => {
    return (
        <div>
            <Header></Header>
            <div style={{  backgroundColor: '#f0f0f0' , height: '800px'}}>
            <Services></Services>
            <FeaturedService></FeaturedService>
        </div>

            <Appointment></Appointment>
            <Blog></Blog>
            <Doctor></Doctor>
            <Contact></Contact>
            <Footer></Footer>
        </div>
    );
};

export default Home;