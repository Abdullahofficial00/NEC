import React from 'react';
// import baby from '../../../images/baby.png';
import baby from '../../../images/doc/doctor chair 2.jpg';


const FeaturedService = () => {
    return (
        <div className="feature-service pb-0 pb-md-5 pt-md-5">
            <div className="container">
                <div className="row mb-5">
                    <div className="col-md-5 col-sm-6 col-12">
                        <img src={baby} className="img-fluid" alt="" />
                    </div>
                    <div className="col-md-7 col-sm-6 col-12 align-self-center">
                        <h1>Exceptional Health Care, on your Term</h1>
                        <ul className="text-primary">
                            <li>Book healthcare appointments online, anytime, anywhere.</li>
                            <li>Access personalized healthcare information and recommendations.</li>
                            <li>Connect with experienced healthcare professionals through virtual consultations.</li>
                            <li>Receive timely reminders for appointments and follow-ups.</li>
                            <li>Securely store and manage your health records.</li>
                        </ul>
                        <button className="btn btn-primary">Learn More</button>
                    </div>
                </div>
            </div>
        </div>
    );
};

export default FeaturedService;