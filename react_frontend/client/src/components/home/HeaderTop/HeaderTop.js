import React from 'react';
import { Link } from 'react-router-dom';
import chair from '../../../images/doc/doc1.png';
const HeaderTop = () => {
    return (
        <div style={{ height: "700px", 'width': '100%' }} className="row align-items-center justify-content-center">
            <div class="col-lg-4 col-md-8">
                <div class="title wow fadeInDown"  className="col-md-10 col-sm-6 col-12 offset-md-2 md-mx-8">
                    <h1 style={{ color: 'black' }}>We Care Medical & Health </h1>
                    <p className="text-secondary" style={{ color: 'blue' }}>
                        Doctor always ready for service. Our Pleasure is in your treatment.
                    </p>
                    <Link to="/appointment" className="btn btn-primary btn-lg shadow rounded" style={{ backgroundColor: 'blue', color: 'white', fontWeight: 'bold', borderRadius: '20px' }}>
                        Make an Appointment +
                    </Link>

                </div>
            </div>
            
            <div className="col-md-8 col-sm-6 col-12">
                <img src={chair} className="img-fluid rounded" alt="" />
            </div>

        </div>
    );
};

export default HeaderTop;