import React from 'react';
import flouride from '../../../images/flouride.png';
import cavity from '../../../images/cavity.png';
import teath from '../../../images/teath.png';
import ServiceDetail from '../ServiceDetail/ServiceDetail';
import './Services.css';

const serviceData = [
    {
        name: 'Online Appointment',
        img: flouride,
        desc: 'Book your appointment online and receive personalized dental care from our experienced professionals.'
    },
    {
        name: 'Medicine',
        img: cavity,
        desc: 'Explore our range of medicines, carefully curated to meet your specific needs and ensure a healthy smile.'
    },
    {
        name: 'Dental Treatment',
        img: teath,
        desc: 'Experience top-notch dental treatments delivered by our skilled and caring team, ensuring your oral health is in good hands.'
    }
]

const Services = () => {
    return (
        <section className="services-container mt-5" id="serviceContaint">
            <div className="text-center">
                <h5 className="brand-color">OUR SERVICES</h5>
                <h2>Services We Provide</h2>
            </div>
            <div className="d-flex justify-content-center mt-5">
                <div className="w-75 row">
                    {
                        serviceData.map(service =><ServiceDetail service={service} key={service.name}></ServiceDetail>)
                    }
                </div>
            </div>
        </section>
    );
};

export default Services;