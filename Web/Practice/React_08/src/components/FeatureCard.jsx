export default function FeatureCard({ title, desc }) {
  return (
    <div style={{ border: "1px solid #ddd", padding: "10px", margin: "10px 0" }}>
      <h4>{title}</h4>
      <p>{desc}</p>
    </div>
  )
}
