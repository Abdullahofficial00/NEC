import { faClock, faMapMarker, faPhone } from '@fortawesome/free-solid-svg-icons';
import InformationCard from '../InformationCard/InformationCard';
import React from 'react';

const infosData = [
    {
        title: 'Opening Hours',
        description: 'We are open 7 days',
        icon: faClock,
        background: 'primary'
    },
    {
        title: 'Visit Our Location',
        description: 'Brooklyn, NY 10003 USA',
        icon: faMapMarker,
        background: 'dark'
    },
    {
        title: 'Call us now',
        description: '+15697854124',
        icon: faPhone,
        background: 'primary'
    }
]

const BusinessInfo = () => {
    return (
        <div  style={{ backgroundColor: '#4285f4', height: '200px' }}>
        <section className="d-flex justify-content-center">
            <div className="row w-75 infos-card">
                {
                    infosData.map(info => <InformationCard info={info} key={info.title}></InformationCard>)
                }
            </div>
        </section>
        </div>
    );
};

export default BusinessInfo;